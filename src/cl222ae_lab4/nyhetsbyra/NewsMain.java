package cl222ae_lab4.nyhetsbyra;

import java.util.ArrayList;
import java.util.List;

public class NewsMain {

	/*
	 * Quick rundown.
	 * 
	 * News agency picks up news --> Issues a press-release.
	 *
	 * Newspapers(listeners) --> Gets notified --> Modifies Article headers -->
	 * Publishes own top stories.
	 * 
	 * PS: Papers can add in-house articles to newsfeed wih addToNewsFeed()
	 * 
	 */

	// Creating press release headlines from the ether that Agencies will share with
	// subscribers.
	private static String[] headlines = { "Brexit is a 50-50 if May's deal rejected.",
			"Price of butter rises 500% by may experts estimate.",
			"NASA Will Keep Trying to Revive the Silent Mars Rover Opportunity Through January",
			"Liverpool stun Arsenal with five-goal blitz as Roberto Firmino bags hat-trick" };

	public static void main(String[] args) {

		// Populate news.
		List<Article> articleList = new ArrayList<Article>();
		articleList.add(new Article("#Brexit", headlines[0], true));
		articleList.add(new Article("#Butter", headlines[1], true));
		articleList.add(new Article("#Nasa", headlines[2], true));
		articleList.add(new Article("#Liverpool-Arsenal", headlines[3], true));

		// Agencies
		Newsagency reuters = new Newsagency("Reuters");
		Newsagency tt = new Newsagency("TT");

		tt.addToNewsFeed(articleList.get(0));
		tt.addToNewsFeed(articleList.get(1));
		reuters.addToNewsFeed(articleList.get(2));
		reuters.addToNewsFeed(articleList.get(3));

		// Papers
		Newspaper svt = new Newspaper("SVT");
		Newspaper dn = new Newspaper("DN");
		Newspaper bbc = new Newspaper("BBC");
		Newspaper telegraph = new Newspaper("Telegraph");

		// Svt creating own article and sending to TT.
		svt.addArticle(new Article("#Extra-val", "Sverige gör sig redo för extra-val.", true));
		tt.addToNewsFeed(svt.getArticle("#Extra-val"));

		// Adding SVT and DN to the feed of TT agency.
		tt.addNewsListener(svt);
		tt.addNewsListener(dn);

		// Adding BBC and Telegraph to the feed of Reuters agency.
		reuters.addNewsListener(bbc);
		reuters.addNewsListener(telegraph);

		// Telegraph will listen to ALL news sources.
		tt.addNewsListener(telegraph);

		// Sending articles to all subscribers of the agencies.
		System.out.println();
		reuters.shareArticles();
		tt.shareArticles();

		// Newspapers rewriting articles.
		svt.getArticle("#Brexit").setHeader("Theresa May's kamp om Brexit fortsätter.");
		svt.getArticle("#Butter").setHeader("Priset på smör når nya höjder!");

		dn.getArticle("#Brexit").setHeader("Rekordmånga Britter söker Irlänska pass efter Brexit.");
		dn.getArticle("#Butter").setHeader("Smörkaos att vänta inför nyårshelgen!");
		dn.getArticle("#Extra-val").setHeader("Extra talmansrunda - sista chansen för en ny regering.");

		telegraph.getArticle("#Extra-val").setHeader("Sweden prepares for new election.");
		telegraph.getArticle("#Nasa").setHeader("Last hope for Mars-rover Opportunity in January.");
		telegraph.getArticle("#Liverpool-arsenal")
				.setHeader("Liverpool win after stunning performance by Roberto Firmino!");

		svt.publish();
		dn.publish();
		bbc.publish();
		telegraph.publish();

	}

}
