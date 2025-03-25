public class TowerSolver {
    private TowerModel model;

    public TowerSolver()
    {
        // Nothing to do here
    }

    public void solve(TowerModel model) {
        this.model = model;
        solveRecursive(model.height(), 0, 2, 1);
    }

    private void solveRecursive(int n, int from, int to, int aux) {
        if (n == 1) {
            model.move(from, to);
            return;
        }
    
        solveRecursive(n - 1, from, aux, to);
        model.move(from, to);
        solveRecursive(n - 1, aux, to, from);
    }
}