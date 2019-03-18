package myweb.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.ui.Model;

@Controller
public class ReplyController{

    @Autowired
    private ReplyServiceImpl replyService;

    @GetMapping(value="/reply/{bno}")
    public String findByBno(@PathVariable("bno") int bno, Model model) throws Exception {
        System.out.println("CONTROLLER..."+"INT(BNO): " + bno);
        List<ReplyDomain> dataList = replyService.findByBno(bno);
        //dataList = replyService.findAll();

        model.addAttribute("pageName", "data1");
        model.addAttribute("dataList", dataList);
        return "page";
    }

    @GetMapping(value="/userData")
    public String userData( int bno, Model model) throws Exception {
        System.out.println("USER_DATA"+"INT(BNO): " + bno);
        List<ReplyDomain> dataList = replyService.findByBno(bno);
        
        model.addAttribute("dataList", dataList);
        return "data";
    }

}