package com.smartdevicelink.rpc.requests;

import java.util.Hashtable;

import com.smartdevicelink.protocol.enums.FunctionId;
import com.smartdevicelink.proxy.RpcRequest;
import com.smartdevicelink.rpc.notifications.OnAppInterfaceUnregistered;

/**
 * Terminates an application's interface registration. This causes SDL&reg; to
 * dispose of all resources associated with the application's interface
 * registration (e.g. Command Menu items, Choice Sets, button subscriptions,
 * etc.)
 * <p>
 * After the UnregisterAppInterface operation is performed, no other operations
 * can be performed until a new app interface registration is established by
 * calling <i>{@linkplain RegisterAppInterface}</i>
 * <p>
 * <b>HMILevel can be FULL, LIMITED, BACKGROUND or NONE</b>
 * </p>
 * 
 * @see RegisterAppInterface
 * @see OnAppInterfaceUnregistered
 */
public class UnregisterAppInterface extends RpcRequest {
	/**
	 * Constructs a new UnregisterAppInterface object
	 */
    public UnregisterAppInterface() {
        super(FunctionId.UNREGISTER_APP_INTERFACE.toString());
    }
	/**
	 * Constructs a new UnregisterAppInterface object indicated by the Hashtable
	 * parameter
	 * <p>
	 * 
	 * @param hash
	 *            The Hashtable to use
	 */    
    public UnregisterAppInterface(Hashtable<String, Object> hash) {
        super(hash);
    }
}