class AbweichungArithMittel extends Abweichung {

    @Override
    protected double berechneMittelwert(double[] stichproben, int anzahl) {
        double mittelwert = 0.0;
        for (int i = 0; i < anzahl; i++) {
            mittelwert += stichproben[i];
        }
        mittelwert *= 1 / anzahl;
        return mittelwert;
    }
    
}