import java.util.List;

import lt.vtvpmc.Article;
import lt.vtvpmc.NewsService;
import lt.vtvpmc.NewsServiceImpl;

public class NNewsServiceImpl implements NewsService {	
	
	private List<Article> articlesList;
	private List<Article> articlesListMod;
	private String [] swearwords = {"rupūs miltai","velniai rautų","velnias","velniais"};
	
	
	public NNewsServiceImpl() {
		articlesList = new NewsServiceImpl().getArticles();		
	}

	@Override
	public List<Article> getArticles() {
		articleservice();
		articlesListMod = articlesList;
		return articlesListMod;
	}
	
	private void repast(String arg1, String arg2){
		Article trustarticle = new NArticle(arg1, arg2);
		articlesListMod.add(trustarticle);
	}
	
	private void articleservice(){
		
		for (int i = 0; i < articlesList.size(); i++) {			
									
			System.out.println(i);
			System.out.println(articlesList.get(i).getHeading());
			System.out.println(articlesList.get(i).getBrief());
			System.out.println();
			


			for (int j = 0; j < swearwords.length; j++) {
//				if (articlesList.get(i).getBrief().length() - swearwords[j].length() == articlesList.get(i).getBrief().compareToIgnoreCase(swearwords[j])){
//					articlesList.get(i).getBrief().replaceAll(swearwords[j], "***");
//				}
				if (articlesList.get(i).getHeading().length() - swearwords[j].length() == articlesList.get(i).getHeading().compareToIgnoreCase(swearwords[j])){
					articlesList.remove(i);
					--i;
					System.out.println("remove");
				}
				}
//			repast(articlesList.get(i).getHeading(), articlesList.get(i).getBrief());
						
		}		
	}
			


}
