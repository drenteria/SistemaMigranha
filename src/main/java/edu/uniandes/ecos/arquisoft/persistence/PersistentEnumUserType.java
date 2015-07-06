package edu.uniandes.ecos.arquisoft.persistence;

import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.usertype.UserType;

public abstract class PersistentEnumUserType implements UserType {

	public Object assemble(Serializable cached, Object owner) 
			throws HibernateException {
		return cached;
	}

	public Object deepCopy(Object value) throws HibernateException {
		return value;
	}

	public Serializable disassemble(Object value) throws HibernateException {
		return (Serializable) value;
	}

	public boolean equals(Object obj1, Object obj2) throws HibernateException {
		return obj1.equals(obj2);
	}

	public int hashCode(Object obj) throws HibernateException {
		return obj == null ? 0 : obj.hashCode(); 
	}

	public boolean isMutable() {
		return false;
	}

	public Object nullSafeGet(
			ResultSet rs, String[] names, 
			SessionImplementor sessImpl, Object owner)
			throws HibernateException, SQLException {
		int id = rs.getInt(names[0]);
		if(rs.wasNull()){
			return null;
		}
		for(Object value : returnedClass().getEnumConstants()){
			PersistentEnum current = (PersistentEnum)value;
			if(id == current.getId()){
				return current;
			}
		}
		throw new IllegalStateException("Unknown " + returnedClass().getSimpleName() + " id");
	}

	public void nullSafeSet(PreparedStatement ps, Object value, 
			int index, SessionImplementor sessImpl)
			throws HibernateException, SQLException {
		if(value == null){
			ps.setNull(index, Types.INTEGER);
		}
		else{
			ps.setInt(index,((PersistentEnum)value).getId());
		}
	}

	public Object replace(Object original, Object target, Object owner) 
			throws HibernateException {
		return original;
	}

	public abstract Class<?> returnedClass();

	public int[] sqlTypes() {
		// TODO Auto-generated method stub
		return new int[] {Types.INTEGER};
	}

}
