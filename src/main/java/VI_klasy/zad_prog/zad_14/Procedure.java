package VI_klasy.zad_prog.zad_14;

public class Procedure {
    String nazwaBadania, dataBadania, imieBadacza, nazwiskoBadacza;
    int oplataZaBadanie;

    public Procedure(final String nazwaBadania, final String dataBadania, final String nazwiskoBadacza, final int oplataZaBadanie) {
        this.nazwaBadania = nazwaBadania;
        this.dataBadania = dataBadania;
        this.nazwiskoBadacza = nazwiskoBadacza;
        this.oplataZaBadanie = oplataZaBadanie;
    }

    public String getNazwaBadania() {
        return nazwaBadania;
    }

    public void setNazwaBadania(final String nazwaBadania) {
        this.nazwaBadania = nazwaBadania;
    }

    public String getDataBadania() {
        return dataBadania;
    }

    public void setDataBadania(final String dataBadania) {
        this.dataBadania = dataBadania;
    }

    public String getImieBadacza() {
        return imieBadacza;
    }

    public void setImieBadacza(final String imieBadacza) {
        this.imieBadacza = imieBadacza;
    }

    public String getNazwiskoBadacza() {
        return nazwiskoBadacza;
    }

    public void setNazwiskoBadacza(final String nazwiskoBadacza) {
        this.nazwiskoBadacza = nazwiskoBadacza;
    }

    public int getOplataZaBadanie() {
        return oplataZaBadanie;
    }

    public void setOplataZaBadanie(final int oplataZaBadanie) {
        this.oplataZaBadanie = oplataZaBadanie;
    }

    @Override
    public String toString() {
        String answer = "nazwaBadania= " + nazwaBadania +
                ",\ndataBadania= " + dataBadania +
                ",\nnazwiskoBadacza= " + nazwiskoBadacza +
                ",\noplataZaBadanie= " + oplataZaBadanie + "\n";
        return answer;
    }
}
