package ufv.dis.final2021.MRA;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.data.value.ValueChangeMode;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.spring.annotation.UIScope;
import org.springframework.util.StringUtils;

@Route
public class MainView extends VerticalLayout {



    private final Button comprobar;

    public MainView(IpsBBDD repo) {
        this.comprobar = new Button("Buscar", VaadinIcon.SEARCH.create());
        TextField textoip = new TextField("Ip a buscar");
        add(textoip,this.comprobar);

        this.comprobar.addClickListener(e -> {
            String ij = textoip.getValue();
            modalMostarInto(repo);
            });
    }
    void modalMostarInto(IpsBBDD repo){
        Dialog dialog = new Dialog();
        Long ada= Long.valueOf(342423443);
        //repo.findByIp_from(ada);
        dialog.add(new Text("ad"));
        dialog.open();
    }
    public static Long Dot2LongIP(String dottedIP) {
        String[] addrArray = dottedIP.split("\\.");
        long num = 0;
        for (int i=0;i<addrArray.length;i++) {
            int power = 3-i;
            num += ((Integer.parseInt(addrArray[i]) % 256) *
                    Math.pow(256, power));
        }
        return num;
    }
    public String longToIp(long ip) {
        StringBuilder result = new StringBuilder(15);
        for (int i = 0; i < 4; i++) {
            result.insert(0,Long.toString(ip & 0xff));
            if (i < 3) {
                result.insert(0,'.');
            }
            ip = ip >> 8;
        }
        return result.toString();
    }
}