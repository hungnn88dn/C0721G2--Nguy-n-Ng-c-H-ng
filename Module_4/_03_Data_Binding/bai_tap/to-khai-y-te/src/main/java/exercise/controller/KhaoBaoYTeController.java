package exercise.controller;

import exercise.model.DiaChiLienLac;
import exercise.model.KhaiBaoYTe;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class KhaoBaoYTeController {

    @GetMapping(value = "")
    public String showHome(){
        return "home";
    }

    @GetMapping(value = "tkyt")
    public String kbyt(Model model){
        String[] namSinh = new String[] {"1999","2000","2001"};
        String[] gioiTinh = new String[] {"Nam","Nu"};
        String[] quocTich = new String[] {"Viet Nam","Lao"};
        String[] thongTinDiLai = new String[] {"Tau Bay","O To", "Thuyen", "Khac"};
        model.addAttribute("diaChiLienLac",new DiaChiLienLac());
        model.addAttribute("namSinh",namSinh);
        model.addAttribute("gioiTinh",gioiTinh);
        model.addAttribute("quocTich",quocTich);
        model.addAttribute("thongTinDiLai",thongTinDiLai);
        model.addAttribute("kbyt", new KhaiBaoYTe());
        return "tkyt";
    }
    @PostMapping(value = "tkyt")
    public String infoSetting(@ModelAttribute("tkyt") KhaiBaoYTe khaiBaoYTe, Model model){
        model.addAttribute("infoKBYT", khaiBaoYTe);
        return "info";
    }

}
