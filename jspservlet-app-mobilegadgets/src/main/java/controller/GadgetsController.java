package controller;

import javax.servlet.http.HttpServlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import javax.servlet.ServletException;
import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import service.GadgetsDao;
import service.GadgetsDaoImpl;
import model.Gadgets;

@WebServlet("/add")
public class GadgetsController extends HttpServlet {

    RequestDispatcher dispatcher = null;
    GadgetsDao gadgetsDao = null;
    
    public GadgetsController() {
        gadgetsDao = new GadgetsDaoImpl();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            List<Gadgets> theList = gadgetsDao.viewGadgetsById();


            RequestDispatcher dispatcher = request.getRequestDispatcher("/index.jsp");
            request.setAttribute("list", theList);
            dispatcher.forward(request, response);

    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException{
       String gadgetName =request.getParameter("coverName");
        double gadgetPrice =Double.valueOf(request.getParameter("enterPrice"));
        String imageUrl =request.getParameter("enterImageUrl");
        int quantity =Integer.valueOf(request.getParameter("enterQuantity"));
        String details =request.getParameter("enterDetails");

        Gadgets gadgets=new Gadgets();
        gadgets.setgadgetName(gadgetName);
        gadgets.setgadgetPrice(gadgetPrice);
        gadgets.setimageUrl(imageUrl);
        gadgets.setquantity(quantity);
        gadgets.setdetails(details);

        try{
            GadgetsDaoImpl gadgetDao=new GadgetsDaoImpl();

            gadgetDao.addGadgets(gadgets);
        }catch(Exception e){
            e.printStackTrace();
        }
        RequestDispatcher dispatcher=request.getRequestDispatcher("WEB-INF/index.jsp");
        dispatcher.forward(request,response);
        
        //doGet(request,response);
        /*response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        out.println("Cover name is"+gadgetName);*/
    }

    /*private void listGadgets(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        List<Gadgets> theList = gadgetsDao.viewGadgetsById();


        RequestDispatcher dispatcher = request.getRequestDispatcher("/index.jsp");
        request.setAttribute("list", theList);
        dispatcher.forward(request, response);
    }*/

}

