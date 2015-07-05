package edu.uniandes.ecos.arquisoft.persistence;

import java.util.Date;
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
public class PacienteDAO implements IGenericDAO {

	private SessionFactory sessionFactory;
	
	public PacienteDAO(){
		sessionFactory = HibernateDBManager.getInstance().getSessionFactory();
	}

	public boolean guardar(Object modelObject) {
		if(modelObject instanceof Paciente){
			try{
				sessionFactory.getCurrentSession().beginTransaction();
				((Paciente)modelObject).setFechaRegistro(new Date());
				sessionFactory.getCurrentSession().save(modelObject);
				sessionFactory.getCurrentSession().getTransaction().commit();
				return true;
			}
			catch(HibernateException ex){
				ex.printStackTrace();
				return false;
			}
		}
		return false;
	}

	@SuppressWarnings("unchecked")
	public List<Object> listarTodos() {
		try{
			Query query = sessionFactory.getCurrentSession().createQuery("from Paciente");
			return query.list();
		}
		catch(HibernateException ex){
			ex.printStackTrace();
			return null;
		}
	}

	public Object buscar(int modelObjectId) {
		try{
			Query query = sessionFactory.getCurrentSession()
				.createQuery("from Paciente WHERE idPaciente = :idPaciente");
			query.setParameter("idPaciente", modelObjectId);
			if(!query.list().isEmpty()){
				return query.list().get(0);
			}
			return null;
		}
		catch(HibernateException ex){
			ex.printStackTrace();
			return null;
		}
	}
	
}
