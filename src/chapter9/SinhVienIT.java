package chapter9;

public class SinhVienIT extends SinhVien {
    private  double scoreJava;
    private double scoreHTML;

    public double getScoreJava() {
        return scoreJava;
    }

    public void setScoreJava(double scoreJava) {
        this.scoreJava = scoreJava;
    }

    public double getScoreHTML() {
        return scoreHTML;
    }

    public void setScoreHTML(double scoreHTML) {
        this.scoreHTML = scoreHTML;
    }

    public SinhVienIT(double scoreJava, double scoreHTML) {
        super();
        this.scoreJava = scoreJava;
        this.scoreHTML = scoreHTML;
    }

    @Override
    public double getDiem(){
      return (this.scoreJava * 2 + this.scoreHTML)/3;
    };
}
