package com.crud.Arquivos;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Postilion {
    private String TIPO_REG_COND_HEA;
    private String ORIGEM_ARQ_COND_HEA;
    private String COD_ADQ_COND_HEA;
    private String SEQUENCIA_ARQ_COND_HEA;
    private String TIME_STAMP_COND_HEA;
    private String TIPO_REG_COND_DET;
    private String COD_TRAN_COND_DET;
    private String MESSAGE_TYPE_COND_DET;
    private String COD_EC_COND_DET;
    private String DT_ORIG_TRAN_COND_DET;
    private String HORA_ORIG_TRAN_COND_DET;
    private String NSU_TRAN_COND_DET;
    private String NUM_PARC_COND_DET;
    private String QT_TOTL_PARC_COND_DET;
    private String NUM_AUTR_TRAN_COND_DET;
    private String NUM_PLAS_TOKN_COND_DET;
    private String TID_COND_DET;
    private String COD_BAND_COND_DET;
    private String VLR_TRANSACAO_COND_DET;
    private String COD_MOED_COND_DET;
    private String COD_ENTRY_MODE_COND_DET;
    private String COD_MCC_COND_DET;
    private String NOME_SOLUCAO_CAP_COND_DET;
    private String COD_MATRICULA_USR_COND_DET;
    private String TIPO_REG_COND_TRA;
    private String TOT_REG_ARQ_COND_TRA;

    public String getTIPO_REG_COND_HEA() {
        return TIPO_REG_COND_HEA;
    }

    public void setTIPO_REG_COND_HEA(String TIPO_REG_COND_HEA) {
        this.TIPO_REG_COND_HEA = TIPO_REG_COND_HEA;
    }

    public String getORIGEM_ARQ_COND_HEA() {
        return ORIGEM_ARQ_COND_HEA;
    }

    public void setORIGEM_ARQ_COND_HEA(String ORIGEM_ARQ_COND_HEA) {
        this.ORIGEM_ARQ_COND_HEA = ORIGEM_ARQ_COND_HEA;
    }

    public String getCOD_ADQ_COND_HEA() {
        return COD_ADQ_COND_HEA;
    }

    public void setCOD_ADQ_COND_HEA(String COD_ADQ_COND_HEA) {
        this.COD_ADQ_COND_HEA = COD_ADQ_COND_HEA;
    }

    public String getSEQUENCIA_ARQ_COND_HEA() {
        return SEQUENCIA_ARQ_COND_HEA;
    }

    public void setSEQUENCIA_ARQ_COND_HEA(String SEQUENCIA_ARQ_COND_HEA) {
        this.SEQUENCIA_ARQ_COND_HEA = SEQUENCIA_ARQ_COND_HEA;
    }

    public String getTIME_STAMP_COND_HEA() {
        return TIME_STAMP_COND_HEA;
    }

    public void setTIME_STAMP_COND_HEA(String TIME_STAMP_COND_HEA) {
        this.TIME_STAMP_COND_HEA = TIME_STAMP_COND_HEA;
    }

    public String getTIPO_REG_COND_DET() {
        return TIPO_REG_COND_DET;
    }

    public void setTIPO_REG_COND_DET(String TIPO_REG_COND_DET) {
        this.TIPO_REG_COND_DET = TIPO_REG_COND_DET;
    }

    public String getCOD_TRAN_COND_DET() {
        return COD_TRAN_COND_DET;
    }

    public void setCOD_TRAN_COND_DET(String COD_TRAN_COND_DET) {
        this.COD_TRAN_COND_DET = COD_TRAN_COND_DET;
    }

    public String getMESSAGE_TYPE_COND_DET() {
        return MESSAGE_TYPE_COND_DET;
    }

    public void setMESSAGE_TYPE_COND_DET(String MESSAGE_TYPE_COND_DET) {
        this.MESSAGE_TYPE_COND_DET = MESSAGE_TYPE_COND_DET;
    }

    public String getCOD_EC_COND_DET() {
        return COD_EC_COND_DET;
    }

    public void setCOD_EC_COND_DET(String COD_EC_COND_DET) {
        this.COD_EC_COND_DET = COD_EC_COND_DET;
    }

    public String getDT_ORIG_TRAN_COND_DET() {
        return DT_ORIG_TRAN_COND_DET;
    }

    public void setDT_ORIG_TRAN_COND_DET(String DT_ORIG_TRAN_COND_DET) {
        this.DT_ORIG_TRAN_COND_DET = DT_ORIG_TRAN_COND_DET;
    }

    public String getHORA_ORIG_TRAN_COND_DET() {
        return HORA_ORIG_TRAN_COND_DET;
    }

    public void setHORA_ORIG_TRAN_COND_DET(String HORA_ORIG_TRAN_COND_DET) {
        this.HORA_ORIG_TRAN_COND_DET = HORA_ORIG_TRAN_COND_DET;
    }

    public String getNSU_TRAN_COND_DET() {
        return NSU_TRAN_COND_DET;
    }

    public void setNSU_TRAN_COND_DET(String NSU_TRAN_COND_DET) {
        this.NSU_TRAN_COND_DET = NSU_TRAN_COND_DET;
    }

    public String getNUM_PARC_COND_DET() {
        return NUM_PARC_COND_DET;
    }

    public void setNUM_PARC_COND_DET(String NUM_PARC_COND_DET) {
        this.NUM_PARC_COND_DET = NUM_PARC_COND_DET;
    }

    public String getQT_TOTL_PARC_COND_DET() {
        return QT_TOTL_PARC_COND_DET;
    }

    public void setQT_TOTL_PARC_COND_DET(String QT_TOTL_PARC_COND_DET) {
        this.QT_TOTL_PARC_COND_DET = QT_TOTL_PARC_COND_DET;
    }

    public String getNUM_AUTR_TRAN_COND_DET() {
        return NUM_AUTR_TRAN_COND_DET;
    }

    public void setNUM_AUTR_TRAN_COND_DET(String NUM_AUTR_TRAN_COND_DET) {
        this.NUM_AUTR_TRAN_COND_DET = NUM_AUTR_TRAN_COND_DET;
    }

    public String getNUM_PLAS_TOKN_COND_DET() {
        return NUM_PLAS_TOKN_COND_DET;
    }

    public void setNUM_PLAS_TOKN_COND_DET(String NUM_PLAS_TOKN_COND_DET) {
        this.NUM_PLAS_TOKN_COND_DET = NUM_PLAS_TOKN_COND_DET;
    }

    public String getTID_COND_DET() {
        return TID_COND_DET;
    }

    public void setTID_COND_DET(String TID_COND_DET) {
        this.TID_COND_DET = TID_COND_DET;
    }

    public String getCOD_BAND_COND_DET() {
        return COD_BAND_COND_DET;
    }

    public void setCOD_BAND_COND_DET(String COD_BAND_COND_DET) {
        this.COD_BAND_COND_DET = COD_BAND_COND_DET;
    }

    public String getVLR_TRANSACAO_COND_DET() {
        return VLR_TRANSACAO_COND_DET;
    }

    public void setVLR_TRANSACAO_COND_DET(String VLR_TRANSACAO_COND_DET) {
        this.VLR_TRANSACAO_COND_DET = VLR_TRANSACAO_COND_DET;
    }

    public String getCOD_MOED_COND_DET() {
        return COD_MOED_COND_DET;
    }

    public void setCOD_MOED_COND_DET(String COD_MOED_COND_DET) {
        this.COD_MOED_COND_DET = COD_MOED_COND_DET;
    }

    public String getCOD_ENTRY_MODE_COND_DET() {
        return COD_ENTRY_MODE_COND_DET;
    }

    public void setCOD_ENTRY_MODE_COND_DET(String COD_ENTRY_MODE_COND_DET) {
        this.COD_ENTRY_MODE_COND_DET = COD_ENTRY_MODE_COND_DET;
    }

    public String getCOD_MCC_COND_DET() {
        return COD_MCC_COND_DET;
    }

    public void setCOD_MCC_COND_DET(String COD_MCC_COND_DET) {
        this.COD_MCC_COND_DET = COD_MCC_COND_DET;
    }

    public String getNOME_SOLUCAO_CAP_COND_DET() {
        return NOME_SOLUCAO_CAP_COND_DET;
    }

    public void setNOME_SOLUCAO_CAP_COND_DET(String NOME_SOLUCAO_CAP_COND_DET) {
        this.NOME_SOLUCAO_CAP_COND_DET = NOME_SOLUCAO_CAP_COND_DET;
    }

    public String getTIPO_REG_COND_TRA() {
        return TIPO_REG_COND_TRA;
    }

    public void setTIPO_REG_COND_TRA(String TIPO_REG_COND_TRA) {
        this.TIPO_REG_COND_TRA = TIPO_REG_COND_TRA;
    }

    public String getTOT_REG_ARQ_COND_TRA() {
        return TOT_REG_ARQ_COND_TRA;
    }

    public void setTOT_REG_ARQ_COND_TRA(String TOT_REG_ARQ_COND_TRA) {
        this.TOT_REG_ARQ_COND_TRA = TOT_REG_ARQ_COND_TRA;
    }
    
    public String getCOD_MATRICULA_USR_COND_DET() {
        return COD_MATRICULA_USR_COND_DET;
    }

    public void setCOD_MATRICULA_USR_COND_DET(String COD_MATRICULA_USR_COND_DET) {
        this.COD_MATRICULA_USR_COND_DET = COD_MATRICULA_USR_COND_DET;
    }
    
    public String postilion() {
        try {
            FileWriter fw = new FileWriter("C:\\Users\\Limitado574\\Desktop\\Site\\D0_CREFISA_.txt", true);
            PrintWriter pw =new PrintWriter(fw);
            pw.print (this.TIPO_REG_COND_HEA+"                "+this.ORIGEM_ARQ_COND_HEA+this.COD_ADQ_COND_HEA+this.SEQUENCIA_ARQ_COND_HEA+this.TIME_STAMP_COND_HEA+"\n");
            pw.print (this.TIPO_REG_COND_DET+this.COD_TRAN_COND_DET+this.MESSAGE_TYPE_COND_DET+this.COD_EC_COND_DET+this.DT_ORIG_TRAN_COND_DET+this.HORA_ORIG_TRAN_COND_DET+this.NSU_TRAN_COND_DET+this.NUM_PARC_COND_DET+this.QT_TOTL_PARC_COND_DET+this.NUM_AUTR_TRAN_COND_DET+this.NUM_PLAS_TOKN_COND_DET+this.TID_COND_DET+this.COD_BAND_COND_DET+this.VLR_TRANSACAO_COND_DET+this.COD_MOED_COND_DET+this.COD_ENTRY_MODE_COND_DET+this.COD_MCC_COND_DET+"            "+this.NOME_SOLUCAO_CAP_COND_DET+"\n");          
            pw.print (this.TIPO_REG_COND_TRA+this.TOT_REG_ARQ_COND_TRA);
            pw.flush();
            pw.close();
            fw.close();
        } catch (IOException ex) {
            System.out.println("Não foi possível criar o arquivo!" + ex.getMessage());
        }       
        return "Arquivo criado com sucesso!";
    }
    
    public String cmm() {
        try {
            FileWriter fw = new FileWriter("C:\\Users\\Limitado574\\Desktop\\Site\\D0_CREFISA_.txt", true);
            PrintWriter pw =new PrintWriter(fw);
            pw.print (this.TIPO_REG_COND_HEA+"                      "+this.ORIGEM_ARQ_COND_HEA+this.COD_ADQ_COND_HEA+this.SEQUENCIA_ARQ_COND_HEA+this.TIME_STAMP_COND_HEA+"\n");
            pw.print (this.TIPO_REG_COND_DET+this.COD_TRAN_COND_DET+this.MESSAGE_TYPE_COND_DET+this.COD_EC_COND_DET+this.DT_ORIG_TRAN_COND_DET+this.HORA_ORIG_TRAN_COND_DET+this.NSU_TRAN_COND_DET+this.NUM_PARC_COND_DET+this.QT_TOTL_PARC_COND_DET+this.NUM_AUTR_TRAN_COND_DET+this.NUM_PLAS_TOKN_COND_DET+this.TID_COND_DET+this.COD_BAND_COND_DET+this.VLR_TRANSACAO_COND_DET+this.COD_MOED_COND_DET+this.COD_ENTRY_MODE_COND_DET+this.COD_MCC_COND_DET+"            "+this.NOME_SOLUCAO_CAP_COND_DET+"\n");          
            pw.print (this.TIPO_REG_COND_TRA+this.TOT_REG_ARQ_COND_TRA);
            pw.flush();
            pw.close();
            fw.close();
        } catch (IOException ex) {
            System.out.println("Não foi possível criar o arquivo!" + ex.getMessage());
        }       
        return "Arquivo criado com sucesso!";
    }
    
    public String ajustes() {
        try {
            FileWriter fw = new FileWriter("C:\\Users\\Limitado574\\Desktop\\Site\\D0_CREFISA_.txt", true);
            PrintWriter pw =new PrintWriter(fw);
            pw.print (this.TIPO_REG_COND_HEA+"                  "+this.ORIGEM_ARQ_COND_HEA+this.COD_ADQ_COND_HEA+this.SEQUENCIA_ARQ_COND_HEA+this.TIME_STAMP_COND_HEA+"\n");
            pw.print (this.TIPO_REG_COND_DET+this.COD_TRAN_COND_DET+this.MESSAGE_TYPE_COND_DET+this.COD_EC_COND_DET+this.DT_ORIG_TRAN_COND_DET+this.HORA_ORIG_TRAN_COND_DET+this.NSU_TRAN_COND_DET+this.NUM_PARC_COND_DET+this.QT_TOTL_PARC_COND_DET+this.NUM_AUTR_TRAN_COND_DET+this.NUM_PLAS_TOKN_COND_DET+this.TID_COND_DET+this.COD_BAND_COND_DET+this.VLR_TRANSACAO_COND_DET+this.COD_MOED_COND_DET+this.COD_ENTRY_MODE_COND_DET+this.COD_MCC_COND_DET+"            "+this.NOME_SOLUCAO_CAP_COND_DET+"\n");          
            pw.print (this.TIPO_REG_COND_TRA+this.TOT_REG_ARQ_COND_TRA);
            pw.flush();
            pw.close();
            fw.close();
        } catch (IOException ex) {
            System.out.println("Não foi possível criar o arquivo!" + ex.getMessage());
        }       
        return "Arquivo criado com sucesso!";
    } 
}
