package is.idega.block.nationalregister.business;


import javax.ejb.CreateException;
import com.idega.business.IBOHome;
import java.rmi.RemoteException;

public interface NationalRegisterBusinessHome extends IBOHome {
	public NationalRegisterBusiness create() throws CreateException,
			RemoteException;
}