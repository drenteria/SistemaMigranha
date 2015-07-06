package edu.uniandes.ecos.arquisoft.persistence;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
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
	}

	public boolean guardarPaciente(Paciente elPaciente) {
		try{
			sessionFactory.getCurrentSession().beginTransaction();
			sessionFactory.getCurrentSession().save(elPaciente);
			sessionFactory.getCurrentSession().getTransaction().commit();
			System.out.println("Paciente guardado con ID: " + elPaciente.getIdPaciente());
			return true;
		}
		catch(HibernateException ex){
			ex.printStackTrace();
			return false;
		}
	}

	public List<Paciente> listarTodos() {
		Query query = sessionFactory.getCurrentSession().createQuery("from Paciente");
		return query.list();
	}

	public Paciente buscarPaciente(int idPaciente) {
		Query query = sessionFactory.getCurrentSession()
				.createQuery("from Paciente WHERE idPaciente = :idPaciente");
		query.setParameter("idPaciente", idPaciente);
		if(!query.list().isEmpty()){
			return (Paciente)query.list().get(0);
		}
		return null;
	}

	
	
}
