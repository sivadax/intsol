/** Beans configuration for Mule
<spring:beans>
	<spring:bean id="CustomKeyStoreLoader" name="CustomKeyStoreLoader" class="org.mule.keys.CustomKeyStoreLoader">
		<spring:property name="keyStorePath" value="/path/to/keystore.jks"/>
	<spring:property name="keyStorePassword" value="your-password"/>
</spring:bean>
**/

public class CustomKeyStoreLoader implements Initialisable{
	private String keyStorePath;
	private String keyStorePassword;

	public CustomKeyStoreLoader(){

	}
	
	@Override
	public void initialise() throws InitialisationException{
		System.setProperty("javax.net.ssl.keyStore", keyStorePath);
		System.setProperty("javax.net.ssl.keyStorePassword", keyStorePassword);
	}

	public void setKeyStorePath(String keyStorePath){
		this.keyStorePath = keyStorePath;
	}

	public String getKeyStorePath(){
		return keyStorePath;
	}

	public void setKeyStorePassword(String keyStorePassword){
		this.keyStorePassword = keyStorePassword;
	}

	public String getKeyStorePassword(){
		return keyStorePassword;
	}
	
}
