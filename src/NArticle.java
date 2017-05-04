import lt.vtvpmc.Article;

public class NArticle implements Article {
	
	private String brief;
	private String heading;
	

	public NArticle() {
		
	}
	public NArticle(String arg1, String arg2){
		this.heading = arg1;
		this.brief = arg2;
	}

	@Override
	public String getBrief() {
		// TODO Auto-generated method stub
		return brief;
	}

	@Override
	public String getHeading() {
		// TODO Auto-generated method stub
		return heading;
	}

}
