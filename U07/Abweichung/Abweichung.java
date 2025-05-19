public abstract class Abweichung {
    public double berechneAbweichung(double[] stichproben, int anzahl) {
        double mittelwert = berechneMittelwert(stichproben, anzahl);
        double abweichung = 0.0;
        for (int i = 0; i < anzahl; i++) {
            abweichung += Math.abs(stichproben[i] - mittelwert);
        }
        abweichung *= 1 / anzahl;
        return abweichung;
    }

    protected abstract double berechneMittelwert(double[] stichproben, int anzahl);
}
