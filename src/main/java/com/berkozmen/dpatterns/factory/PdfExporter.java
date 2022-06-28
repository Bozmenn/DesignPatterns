package com.berkozmen.dpatterns.factory;

 class PdfExporter implements FileExporter{
    @Override
    public String export(String content) {
        return "PDF -> " + content;
    }
}
