import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Created by Administrator on 2017/7/28.
 */
public class UploadServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        InputStream in = req.getInputStream();
        /*OutputStream os = new FileOutputStream("e:/1.txt");
        IOUtils.copy(in,os)*/;
        //IOUtils.copyLarge(in,System.out);
        if(ServletFileUpload.isMultipartContent(req)){
            ServletFileUpload upload = new ServletFileUpload(new DiskFileItemFactory());
            try {
                List<FileItem> list = upload.parseRequest(req);

                
            } catch (FileUploadException e) {
                e.printStackTrace();
            }

        }



    }
}
