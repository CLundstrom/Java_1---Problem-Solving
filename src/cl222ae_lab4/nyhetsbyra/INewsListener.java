package cl222ae_lab4.nyhetsbyra;

// Implemented by all news receivers.
public interface INewsListener {

	void messageReceived(Article art);

	String getName();
}
