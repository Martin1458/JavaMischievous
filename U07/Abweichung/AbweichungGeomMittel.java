class AbweichungGeomMittel extends Abweichung {
    
    @Override
    protected double berechneMittelwert(double[] stichproben, int anzahl) {
        double mittelwert = 1.0;
        for (int i = 0; i < anzahl; i++) {
            mittelwert *= stichproben[i];
        }
        mittelwert = Math.pow(mittelwert, 1 / anzahl);
        return mittelwert;
    }

}