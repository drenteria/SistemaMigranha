package edu.uniandes.ecos.arquisoft.persistence;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import edu.uniandes.ecos.arquisoft.model.Paciente;

/**
 * DAO (Data Access Object) para la entidad de negocio Paciente
 * @author drenteria
 *
 */
public class PacienteDAO implements IPacienteDAO {

	private SessionFactory sessionFactory;
	
	public PacienteDAO(){
		sessionFactory = HibernateDBManager.getInstance().getSessionFactory();
		sessionFactory.openSession();
	}
	
	private void setUpSession() {
		sessionFactory.openSession();		
	}
	
	private void closeSession() {
		if(sessionFactory.getCurrentSession().isOpen()){
			sessionFactory.getCurrentSession().close();
		}
	}

	@Override
	public boolean guardarPaciente(Paciente elPaciente) {
		try{
			setUpSession();
			sessionFactory.getCurrentSession().beginTransaction();
			sessionFactory.getCurrentSession().save(elPaciente);
			sessionFactory.getCurrentSession().getTransaction().commit();
			System.out.println("Paciente guardado con ID: " + elPaciente.getIdPaciente());
			return true;
		}
		catch(HibernateException ex){
			ex.printStackTrace();
		}
		finally{
			closeSession();
		}
		return false;
	}

	@Override
	public List<Paciente> listarTodos() {
		try {
			setUpSession();
			sessionFactory.getCurrentSession().beginTransaction();
			Query query = sessionFactory.getCurrentSession().createQuery("from Paciente");
			sessionFactory.getCurrentSession().getTransaction().commit();
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			closeSession();
		}
		return new ArrayList<Paciente>();
	}

	@Override
	public Paciente buscarPaciente(int idPaciente) {
		try {
			setUpSession();
			Query query = sessionFactory.getCurrentSession()
					.createQuery("from Paciente WHERE idPaciente = :idPaciente");
			query.setParameter("idPaciente", idPaciente);
			if(!query.list().isEmpty()){
				return (Paciente)query.list().get(0);
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			closeSession();
		}
		return null;
	}

	
	
}
