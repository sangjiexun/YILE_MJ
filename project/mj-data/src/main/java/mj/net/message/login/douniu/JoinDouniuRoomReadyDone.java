package mj.net.message.login.douniu;

import java.io.IOException;

import com.isnowfox.core.io.Input;
import com.isnowfox.core.io.Output;
import com.isnowfox.core.io.ProtocolException;
import com.isnowfox.core.net.message.AbstractMessage;

public class JoinDouniuRoomReadyDone extends AbstractMessage{
	public static final int TYPE=2;
	public static final int ID=4;
	@Override
	public void decode(Input arg0) throws IOException, ProtocolException {
	}
	@Override
	public void encode(Output arg0) throws IOException, ProtocolException {
		
	}
	@Override
	public int getMessageId() {
		return ID;
	}
	@Override
	public int getMessageType() {
		return TYPE;
	}
	@Override
	public String toString() {
		return "JoinDouniuRoomReadyDone []";
	}
	
	
	
}
