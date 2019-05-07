package cl222ae_lab4.nyhetsbyra;

import java.util.ArrayList;
import java.util.List;

//	Subscribes to the news agency.
public class Newspaper implements INewsListener {

	private String name;
	private List<Article> articles = new ArrayList<Article>();

	public Newspaper(String name) {
		this.name = name;

	}

	public Article getArticleAt(int index) {

		if (articles.get(index).isShared() == false) {

			throw new IllegalStateException("Cannot get Article. Shared = false");
		}

		else {

			return articles.get(index);
		}
	}

	public Article getArticle(String tag) {

		for (Article art : articles) {

			// Matching article tags.
			if (art.getTag().equalsIgnoreCase(tag)) {
				return art;
			}
		}

		System.out.println("No article found.");
		return null;
	}

	public boolean addArticle(Article art) {

		int matches = 0;

		for (Article article : articles) {
			// Matching tags? Do not add article.
			if (article.getTag() == art.getTag()) {
				matches++;
			}
		}
		if (matches == 0) {
			this.articles.add(new Article(art.getTag(), art.getHeader()));
			return true;
		}
		
		return false;
	}

	public void publish() {
		System.out.println(this.name + ":------------Top Stories-------------------------");
		System.out.println();
		for (Article art : articles) {
			System.out.println(art.getHeader());
		}
		System.out.println("---------------------------------------------------");
		System.out.println();
	}

	
	
	// Will not receive article if duplicate.
	@Override
	public void messageReceived(Article art) {

		if(addArticle(art) == true) {
			
			System.out.println(this.name + ": " + art.getTag() + " received.");
		}
		else {
			System.err.println(this.name + ": " + art.getTag() + " not received. (duplicate)");
		}
		
	}

	@Override
	public String getName() {

		return this.name;
	}

}
