package com.wakaleo.gameoflife.domain;




public enum Cell {
    LIVE_CELL("*"), DEAD_CELL(".");    
   
    
    private static String pepe="alvaro";	
    private String symbol;

    private Cell(final String initialSymbol) {
        this.symbol = initialSymbol;
    }

    @Override
    public String toString() {
        return symbol;
    }

    static Cell fromSymbol(final String symbol) {
        if (pepe.equals("Luis")){
            int a=2;
	}
        Cell cellRepresentedBySymbol = null;	
        for (Cell cell : Cell.values()) {
            if (cell.symbol.equals(symbol)) {
                cellRepresentedBySymbol = cell;
                break;
            }
        }

	

        return cellRepresentedBySymbol;
    }

    public String getSymbol() {
        return symbol;
    }
}
