package cl222ae_lab4.nyhetsbyra;

public class Article {

	private String tag;
	private String header;
	private boolean shared;
	private boolean received;

	/**
	 * @param tag    Set a keyword tag for the news.
	 * @param header News headline.
	 */
	public Article(String tag, String header) {
		if (header != null && tag != null) {
			this.tag = tag;
			this.header = header;
			this.shared = false;
		} else {
			throw new NullPointerException("Constructor missing fields.");
		}
	}

	/**
	 * @param tag    Set a keyword tag for the news.
	 * @param header News headline.
	 * @param shared Share with other newspapers. Default: false.
	 */
	public Article(String tag, String header, boolean shared) {
		if (header != null && tag != null) {
			this.tag = tag;
			this.header = header;
			this.shared = shared;
		} else {
			throw new NullPointerException("Constructor missing fields.");
		}
	}

	public boolean equals(Article article) {

		if (this.tag.equalsIgnoreCase(article.tag)) {
			return true;
		}
		return false;
	}

	public void setHeader(String header) {
		// Is ok to be null.
		this.header = header;
	}

	public String getTag() {
		if (this.tag == null) {
			throw new NullPointerException("Article has no tag.");
		}

		return this.tag;
	}

	public boolean isShared() {
		return this.shared;
	}

	public String getHeader() {

		return header;
	}

	public void setArticleReceived() {
		if (this.received == false) {
			this.received = true;
		} else {
			System.err.println("Article already received.");
		}

	}

	public boolean isReceived() {

		return received;
	}
}
