package step;


import io.cucumber.java.es.Dado;
import io.cucumber.java.pt.Entao;
import page.HomePage;

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