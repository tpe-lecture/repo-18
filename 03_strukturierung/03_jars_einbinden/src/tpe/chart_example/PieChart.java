package tpe.chart_example;

import javax.swing.JFrame;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.data.general.DefaultPieDataset;

/**
 * Fenster mit der Torten-Grafik.
 */
public final class PieChart {

    /**
     * Konstruktor.
     */
    private PieChart() {
        // keine Objekte benötigt.
    }

    /**
     * Main-Methode.
     *
     * @param args Kommandozeilen-Argumente
     */
    public static void main(String[] args) {

        final String title = "Welches ist Euer Lieblingsspiel?";

        JFrame jframe = new JFrame(title);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        DefaultPieDataset dataset  = new DefaultPieDataset();
        dataset.setValue("Divinity Original Sin", 50);
        dataset.setValue("Stardew valley 3", 40);
        dataset.setValue("Neverwinter ", 5);
        dataset.setValue("Fallout 4", 5);
        dataset.setValue("LOL", 30);

        JFreeChart chart = ChartFactory.createPieChart3D(
                title,
                dataset,
                true,
                true,
                false);

        PiePlot3D plot = (PiePlot3D) chart.getPlot();
        plot.setForegroundAlpha(0.6f);

        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(500, 270));
        jframe.setContentPane(chartPanel);
        jframe.pack();
        jframe.setVisible(true);
    }
}
