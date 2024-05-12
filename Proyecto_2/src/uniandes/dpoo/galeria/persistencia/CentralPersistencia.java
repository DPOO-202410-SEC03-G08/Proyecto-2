package uniandes.dpoo.galeria.persistencia;

public class CentralPersistencia
{
    public static final String JSON = "JSON";

    public static IPersistenciaGaleria getPersistenciaGaleria( String tipoArchivo ) throws TipoInvalidoException
    {
        if( JSON.equals( tipoArchivo ) )
            return new PersistenciaGaleriaJson( );
        else
            throw new TipoInvalidoException( tipoArchivo );
    }
}
