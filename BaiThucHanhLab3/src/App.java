package BaiThucHanhLab3.src;

import BaiThucHanhLab3.src.HinhHocc.HinhChuNhat;
import BaiThucHanhLab3.src.HinhHocc.HinhTron;
import BaiThucHanhLab3.src.HinhHocc.HinhTru;
import BaiThucHanhLab3.src.HinhHocc.HinhVuong;

public class App {
    public static void main(String[] args) {

        HinhTron ht = new HinhTron();
        ht.xuatten();
        ht.nhapbankinh();
        ht.tinhdientich();
        ht.inchuvi();
        ht.indientich();

        HinhTru htru = new HinhTru();
        htru.xuatten();
        htru.nhapchieucao();
        htru.tinhthetich();
        htru.indientich();

        HinhChuNhat hcn = new HinhChuNhat();
        hcn.xuatten();
        hcn.nhapchieudai();
        hcn.nhapchieurong();
        hcn.tinhchuvi();
        hcn.tinhdientich();
        hcn.inchuvi();
        hcn.indientich();

        HinhVuong hv = new HinhVuong();
        hv.xuatten();
        hv.nhapcanh();
        hv.tinhchuvi();
        hv.tinhdientich();
        hv.inchuvi();
        hv.indientich();
    }
}