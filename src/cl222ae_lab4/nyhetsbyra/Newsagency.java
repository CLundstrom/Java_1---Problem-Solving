package cl222ae_lab4.nyhetsbyra;

import java.util.ArrayList;
import java.util.List;

//Releases news-headlines. 
public class Newsagency {

	private String name;
	private List<Article> articleList = new ArrayList<Article>();
	private List<INewsListener> subscribers = new ArrayList<INewsListener>();

	public Newsagency(String name) {

		if (name != null) {
			this.name = name;
		}
	}

	private String getName() {

		return this.name;
	}

	public void addToNewsFeed(Article art) {
		if (art != null) {
			articleList.add(art);
			System.out.println(art.getTag() + " added to " +  this.getName() + " news feed.");
		} else {
			throw new NullPointerException("No article passed to news feed.");
		}
	}

	//Adding a listener, could be anyone who implements INewsListener.
	public void addNewsListener(INewsListener listener) {
		subscribers.add(listener);
	}

	// Notify everyone who subscribes to Agency.
	public void notifySubscribers(Article article) {
		System.out.println(getName() + " press release: " + "Newstag: " + article.getTag());

		for (INewsListener sub : subscribers) {

			sub.messageReceived(article);
		}
	}

	public void shareArticles() {

		for (Article art : this.articleList) {
			notifySubscribers(art);
			System.out.println();
		}
	}
}
