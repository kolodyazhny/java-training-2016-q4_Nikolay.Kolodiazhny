package ua.nure.kolodiazhny.SummaryTask4.web.command;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.log4j.Logger;

import ua.nure.kolodiazhny.SummaryTask4.Path;
import ua.nure.kolodiazhny.SummaryTask4.db.DBManager;
import ua.nure.kolodiazhny.SummaryTask4.db.bean.ProductBean;
import ua.nure.kolodiazhny.SummaryTask4.web.command.ListProductsCommand;

/**
 * List products command.
 *
 * @author Nikolay Kolodiazhny
 *
 */
public class ListProductsCommand extends Command {

	private static final long serialVersionUID = 4414370460824078383L;

	private static final Logger LOG = Logger
			.getLogger(ListProductsCommand.class);

	@Override
	public String execute(HttpServletRequest request,
			HttpServletResponse response) throws IOException, ServletException {
		LOG.debug("Command starts");

		List<ProductBean> productBeans = DBManager.getInstance()
				.getAllProductBeans();
		LOG.trace("Found in DB: productsList --> " + productBeans);

		request.setAttribute("productBeans", productBeans);
		LOG.trace("Set the request attribute: products --> " + productBeans);

		LOG.debug("Command finished");
		return Path.PAGE_LIST_PRODUCTS;
	}
}
