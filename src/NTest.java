import lt.vtvpmc.BaseNewsServiceTest;
import lt.vtvpmc.NewsService;
import lt.vtvpmc.NewsServiceImpl;

public class NTest extends BaseNewsServiceTest {

	@Override
	protected NewsService getNewsService() {
		NewsService nserv = new NNewsServiceImpl();
		return nserv;
	}

}
