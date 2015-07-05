package edu.uniandes.ecos.arquisoft.persistence;

import java.util.List;

public interface IGenericDAO {
	
	public boolean guardar(Object modelObject);
	
	public List<Object> listarTodos();
	
	public Object buscar(int modelObjectId);
}
