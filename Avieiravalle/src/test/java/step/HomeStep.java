package step;

import cucumber.api.java.pt.*;
import page.HomePage;
import io.cucumber.datatable.DataTable;
import java.util.List;
import java.util.Map;

public class HomeStep {
    private HomePage homePage;

    public HomeStep(){
        this.homePage = new HomePage();
    }

    @Dado("preenchar o campo com {string} e clicar em procurar")
    public void preenchar_o_campo_com_e_clicar_em_procurar(String Search) {
        this.homePage.inserirPesquisa(Search);
    }


    @Entao("Sera apresentado os videos")
    public void sera_apresentado_os_videos() {
        this.homePage.entreNoVideo();
    }
}