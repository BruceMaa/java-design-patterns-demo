
public clas ExportFinancialPdfFile implements ExportFile {

    @Override
    public boolean export(String data) {

        System.out.println("导出财务版PDF文件");
        return true;
    }
}
