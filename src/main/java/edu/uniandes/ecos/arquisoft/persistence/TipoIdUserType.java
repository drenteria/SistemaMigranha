package edu.uniandes.ecos.arquisoft.persistence;

import edu.uniandes.ecos.arquisoft.model.TipoIdentificacion;

public class TipoIdUserType extends PersistentEnumUserType {

	@Override
	public Class<TipoIdentificacion> returnedClass() {
		return TipoIdentificacion.class;
	}

}
