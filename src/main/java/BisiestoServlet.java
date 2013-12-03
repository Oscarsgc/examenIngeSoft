import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BisiestoServlet extends HttpServlet {
	Anio anio = new Anio();

	@Override
	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String year = request.getParameter("anio");
		anio.setAnio(Integer.parseInt(year));
		if (anio.esBisiesto()) {
			response.getWriter().println(
					"El anio " + anio.getAnio() + " es Bisiesto!");
		} else {
			response.getWriter().println(
					"El anio " + anio.getAnio() + " No es Bisiesto!");
		}
	}
}
