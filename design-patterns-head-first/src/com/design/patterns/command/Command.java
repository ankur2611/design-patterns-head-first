package src.com.design.patterns.command;

/**
 * The Command interface acts as an abstraction for encapsulating
 * a request or operation as an object. This allows for parameterization
 * of clients with requests, queuing of requests, and logging.
 * It also enables undoable operations.
 */
public interface Command {
    /**
     * Execute method that will be implemented by concrete commands.
     * It encapsulates the action that needs to be performed.
     */
    public void execute();
}
