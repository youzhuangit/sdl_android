package com.smartdevicelink.rpc.responses;

import java.util.Hashtable;

import com.smartdevicelink.protocol.enums.FunctionId;
import com.smartdevicelink.proxy.RpcResponse;
import com.smartdevicelink.rpc.enums.TriggerSource;

/**
 * PerformInteraction Response is sent, when PerformInteraction has been called
 * 
 * @since SmartDeviceLink 1.0
 */
public class PerformInteractionResponse extends RpcResponse {
    public static final String KEY_MANUAL_TEXT_ENTRY = "manualTextEntry";
    public static final String KEY_TRIGGER_SOURCE = "triggerSource";
    public static final String KEY_CHOICE_ID = "choiceID";

	/**
	 * Constructs a new PerformInteractionResponse object
	 */
    public PerformInteractionResponse() {
        super(FunctionId.PERFORM_INTERACTION.toString());
    }

	/**
	 * Constructs a new PerformInteractionResponse object indicated by the Hashtable
	 * parameter
	 * <p>
	 * 
	 * @param hash
	 *            The Hashtable to use
	 */
    public PerformInteractionResponse(Hashtable<String, Object> hash) {
        super(hash);
    }
    /**
     * Gets the application-scoped identifier that uniquely identifies this choice.
     * @return choiceID Min: 0  Max: 65535
     */   
    public Integer getChoiceId() {
        return (Integer) parameters.get( KEY_CHOICE_ID );
    }
    /**
     * Sets the application-scoped identifier that uniquely identifies this choice.
     * @param choiceId Min: 0  Max: 65535
     */ 
    public void setChoiceId( Integer choiceId ) {
        if (choiceId != null) {
            parameters.put(KEY_CHOICE_ID, choiceId );
        } else {
            parameters.remove(KEY_CHOICE_ID);
        }
    }
    /**
     * <p>Returns a <I>TriggerSource</I> object which will be shown in the HMI</p>    
     * @return TriggerSource a TriggerSource object
     */    
    public TriggerSource getTriggerSource() {
        Object obj = parameters.get(KEY_TRIGGER_SOURCE);
        if (obj instanceof TriggerSource) {
            return (TriggerSource) obj;
        } else if (obj instanceof String) {
            return TriggerSource.valueForString((String) obj);
        }
        return null;
    }
    /**
     * <p>Sets TriggerSource<br/>
     * Indicates whether command was selected via VR or via a menu selection (using the OK button).</p>    
     * @param triggerSource a TriggerSource object
     */    
    public void setTriggerSource( TriggerSource triggerSource ) {
        if (triggerSource != null) {
            parameters.put(KEY_TRIGGER_SOURCE, triggerSource );
        } else {
            parameters.remove(KEY_TRIGGER_SOURCE);
        }
    }
    
    public void setManualTextEntry(String manualTextEntry) {
        if (manualTextEntry != null) {
            parameters.put(KEY_MANUAL_TEXT_ENTRY, manualTextEntry);
        } else {
            parameters.remove(KEY_MANUAL_TEXT_ENTRY);
        }
    }
    public String getManualTextEntry() {
        return (String) parameters.get(KEY_MANUAL_TEXT_ENTRY);
    }    
}