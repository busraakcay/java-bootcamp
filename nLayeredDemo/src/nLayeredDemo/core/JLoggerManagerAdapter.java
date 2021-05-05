package nLayeredDemo.core;

import nLayeredDemo.jlogger.jLoggerManager;

public class JLoggerManagerAdapter implements LoggerService{

	@Override
	public void logToSystem(String message) {
		jLoggerManager manager = new jLoggerManager();
		manager.log(message);
	}

}
