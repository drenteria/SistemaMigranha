package edu.uniandes.ecos.arquisoft.persistence;

import edu.uniandes.ecos.arquisoft.model.Genero;

public class GeneroUserType extends PersistentEnumUserType {

	@Override
	public Class<Genero> returnedClass() {
		return Genero.class;
	}

}
