/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Note;

/**
 *
 * @author Vladik
 */
public class NoteServlet extends HttpServlet {


    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String pageSelect = request.getParameter("edit");
        
        String path = getServletContext().getRealPath("/WEB-INF/note.txt");
        
        request.setAttribute("note", new Note(path) );
            
            
        if (pageSelect != null) {
            getServletContext()
                    .getRequestDispatcher("/WEB-INF/editnote.jsp")
                    .forward(request, response);
        } else {
            getServletContext()
                    .getRequestDispatcher("/WEB-INF/viewnote.jsp")
                    .forward(request, response);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String contentText = request.getParameter("contentText");
        String titleText = request.getParameter("titleText");
        String path = getServletContext().getRealPath("/WEB-INF/note.txt");
        
        Note newNote = new Note(titleText,contentText,path);
        
        request.setAttribute("note", newNote);
        getServletContext()
                .getRequestDispatcher("/WEB-INF/viewnote.jsp")
                .forward(request, response);
    }
}
