package com.crud.Arquivos;

import javax.swing.JOptionPane;

public class GeraArquivo extends javax.swing.JFrame {


    public GeraArquivo() {
        initComponents();
        setLocationRelativeTo(null);
        //jFormatTpRegistroHead.setDocument(new ValidaCampos());
    }
    private void limpacampos() {
        jFormatTpRegistroHead.setText("");
        jFormattedTxtCodAdq.setText("");
        jFormattedTxtSeqArq.setText("");
        jFormatedTextDataHoraArq.setText("");
        jFormatTipoRegistroDet.setText("");
        jFormattedCodTransacao.setText("");
        jFormattedTpMensagem.setText("");
        jFormattedTCodEc.setText("");
        jFormattedDtTrnasacao.setText("");
        jTxtHrTransacao.setText("");
        jTxtNsu.setText("");
        jTxtNrParcela.setText("");
        jTxtTotParcelas.setText("");
        jTxtNrAutorizacao.setText("");
        jTxtNrCartao.setText("");
        jTxtNrLogico.setText("");
        jTxtBandeira.setText("");
        jTxtValor.setText("");
        jTxtMoeda.setText("");
        jTxtModoEntrada.setText("");
        jTxtMcc.setText("");
        jTxtSoluCaptura.setText("");
        jFormatTpRegistroTra.setText("");
        jTxtTotalRegi.setText("");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLblTipoRegistroHeader = new javax.swing.JLabel();
        jLblOrigemArquivo = new javax.swing.JLabel();
        jLblCodAdquirente = new javax.swing.JLabel();
        jLblSequenciaArq = new javax.swing.JLabel();
        jLblDataHoraArq = new javax.swing.JLabel();
        jFormatTpRegistroHead = new javax.swing.JFormattedTextField();
        jComboBoxOrigemArq = new javax.swing.JComboBox<>();
        jFormatedTextDataHoraArq = new javax.swing.JFormattedTextField();
        jFormattedTxtCodAdq = new javax.swing.JFormattedTextField();
        jFormattedTxtSeqArq = new javax.swing.JFormattedTextField();
        jPanel2 = new javax.swing.JPanel();
        jLblTipoRegistroDet = new javax.swing.JLabel();
        jLblCodTran = new javax.swing.JLabel();
        jLblTpMensagem = new javax.swing.JLabel();
        jLblCodEC = new javax.swing.JLabel();
        jLblDtTransacao = new javax.swing.JLabel();
        jLblHrTransacao = new javax.swing.JLabel();
        jLblNSU = new javax.swing.JLabel();
        jLblNrParcela = new javax.swing.JLabel();
        jLblTotParcelas = new javax.swing.JLabel();
        jLblNrAutorizacao = new javax.swing.JLabel();
        jLblNrCartao = new javax.swing.JLabel();
        jLblNrLogico = new javax.swing.JLabel();
        jLblBandeira = new javax.swing.JLabel();
        jLblValor = new javax.swing.JLabel();
        jLblMoeda = new javax.swing.JLabel();
        jLblModoEntrada = new javax.swing.JLabel();
        jLblMCC = new javax.swing.JLabel();
        jLblCaptura = new javax.swing.JLabel();
        jFormatTipoRegistroDet = new javax.swing.JFormattedTextField();
        jTxtHrTransacao = new javax.swing.JTextField();
        jTxtNsu = new javax.swing.JTextField();
        jTxtNrParcela = new javax.swing.JTextField();
        jTxtTotParcelas = new javax.swing.JTextField();
        jTxtNrAutorizacao = new javax.swing.JTextField();
        jTxtNrCartao = new javax.swing.JTextField();
        jTxtNrLogico = new javax.swing.JTextField();
        jTxtValor = new javax.swing.JTextField();
        jTxtBandeira = new javax.swing.JTextField();
        jTxtMoeda = new javax.swing.JTextField();
        jTxtModoEntrada = new javax.swing.JTextField();
        jTxtMcc = new javax.swing.JTextField();
        jTxtSoluCaptura = new javax.swing.JTextField();
        jFormattedCodTransacao = new javax.swing.JFormattedTextField();
        jFormattedTpMensagem = new javax.swing.JFormattedTextField();
        jFormattedTCodEc = new javax.swing.JFormattedTextField();
        jFormattedDtTrnasacao = new javax.swing.JFormattedTextField();
        jPanel3 = new javax.swing.JPanel();
        jLblTipoRegistroTrailer = new javax.swing.JLabel();
        jFormatTpRegistroTra = new javax.swing.JFormattedTextField();
        jLblTotaRegi = new javax.swing.JLabel();
        jTxtTotalRegi = new javax.swing.JTextField();
        jBtnGravar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Configuração de arquivos");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Header do Arquivo"));

        jLblTipoRegistroHeader.setText("Tipo de registro");

        jLblOrigemArquivo.setText("Origem do arquivo");

        jLblCodAdquirente.setText("Codigo Adquirente");

        jLblSequenciaArq.setText("Sequencia do arquivo");

        jLblDataHoraArq.setText("Data/hora do arquivo");

        try {
            jFormatTpRegistroHead.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormatTpRegistroHead.setToolTipText("Tipo de registro com 1 dígito");

        jComboBoxOrigemArq.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "POSTILION", "CMM", "AJUSTES", " " }));

        try {
            jFormatedTextDataHoraArq.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##############")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormatedTextDataHoraArq.setToolTipText("Data Hora de geração do arquivo");

        try {
            jFormattedTxtCodAdq.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTxtCodAdq.setToolTipText("Código do ADQ com 9 dígitos");

        try {
            jFormattedTxtSeqArq.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("######")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTxtSeqArq.setToolTipText("Sequencia do Arquivo com 6 dígitos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLblTipoRegistroHeader)
                    .addComponent(jFormatTpRegistroHead, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLblOrigemArquivo)
                        .addGap(10, 10, 10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jComboBoxOrigemArq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLblCodAdquirente)
                    .addComponent(jFormattedTxtCodAdq, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLblSequenciaArq)
                    .addComponent(jFormattedTxtSeqArq, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLblDataHoraArq)
                    .addComponent(jFormatedTextDataHoraArq, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblTipoRegistroHeader)
                    .addComponent(jLblDataHoraArq)
                    .addComponent(jLblSequenciaArq)
                    .addComponent(jLblCodAdquirente)
                    .addComponent(jLblOrigemArquivo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFormatTpRegistroHead, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxOrigemArq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormatedTextDataHoraArq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTxtCodAdq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTxtSeqArq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Registro detalhe"));

        jLblTipoRegistroDet.setText("Tipo de registro");

        jLblCodTran.setText("Código da Transação");

        jLblTpMensagem.setText("Tipo de mensagem");

        jLblCodEC.setText("Código EC");

        jLblDtTransacao.setText("Data transação");

        jLblHrTransacao.setText("Hora transação");

        jLblNSU.setText("NSU");

        jLblNrParcela.setText("Numero da pacela");

        jLblTotParcelas.setText("Total de parcelas");

        jLblNrAutorizacao.setText("Número autorização");

        jLblNrCartao.setText("Número Cartão");

        jLblNrLogico.setText("Número lógico");

        jLblBandeira.setText("Bandeira");

        jLblValor.setText("Valor");

        jLblMoeda.setText("Moeda");

        jLblModoEntrada.setText("Modo de entrada");

        jLblMCC.setText("MCC");

        jLblCaptura.setText("Captura");

        try {
            jFormatTipoRegistroDet.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormatTipoRegistroDet.setToolTipText("Tipo de registro com 1 dígito");

        jTxtNrAutorizacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtNrAutorizacaoActionPerformed(evt);
            }
        });

        try {
            jFormattedCodTransacao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedCodTransacao.setToolTipText("Código da transação com 10 dígitos");

        try {
            jFormattedTpMensagem.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTpMensagem.setToolTipText("Tipo de mensagem com 4 dígitos");

        try {
            jFormattedTCodEc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###############")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTCodEc.setToolTipText("Código EC 15 dígitos");

        try {
            jFormattedDtTrnasacao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedDtTrnasacao.setToolTipText("Data da transação formato AAAAMMDD");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLblNrAutorizacao)
                    .addComponent(jTxtNrAutorizacao, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTxtNrCartao, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLblNrCartao)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTxtNrLogico, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLblNrLogico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTxtBandeira, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLblBandeira, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLblValor))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jTxtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLblMoeda)
                    .addComponent(jTxtMoeda, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLblModoEntrada, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTxtModoEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLblMCC, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtMcc, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLblCaptura)
                    .addComponent(jTxtSoluCaptura, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLblTipoRegistroDet)
                    .addComponent(jFormatTipoRegistroDet, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLblCodTran)
                    .addComponent(jFormattedCodTransacao, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLblTpMensagem)
                    .addComponent(jFormattedTpMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLblCodEC, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 51, Short.MAX_VALUE))
                    .addComponent(jFormattedTCodEc))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLblDtTransacao)
                    .addComponent(jFormattedDtTrnasacao, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLblHrTransacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTxtHrTransacao, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLblNSU, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtNsu, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLblNrParcela)
                    .addComponent(jTxtNrParcela, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLblTotParcelas)
                    .addComponent(jTxtTotParcelas, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblTipoRegistroDet)
                    .addComponent(jLblCodTran)
                    .addComponent(jLblTpMensagem)
                    .addComponent(jLblCodEC)
                    .addComponent(jLblDtTransacao)
                    .addComponent(jLblHrTransacao)
                    .addComponent(jLblNSU)
                    .addComponent(jLblNrParcela)
                    .addComponent(jLblTotParcelas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFormatTipoRegistroDet, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtHrTransacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtNsu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtNrParcela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtTotParcelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedCodTransacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTpMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTCodEc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedDtTrnasacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblNrAutorizacao)
                    .addComponent(jLblNrCartao)
                    .addComponent(jLblNrLogico)
                    .addComponent(jLblBandeira)
                    .addComponent(jLblValor)
                    .addComponent(jLblMoeda)
                    .addComponent(jLblModoEntrada)
                    .addComponent(jLblMCC)
                    .addComponent(jLblCaptura))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtNrAutorizacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtNrCartao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtNrLogico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtBandeira, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtMoeda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtModoEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtMcc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtSoluCaptura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 9, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Trailer do arquvo"));

        jLblTipoRegistroTrailer.setText("Tipo de registro");

        try {
            jFormatTpRegistroTra.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLblTotaRegi.setText("Total de registros");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLblTipoRegistroTrailer)
                    .addComponent(jFormatTpRegistroTra, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLblTotaRegi)
                    .addComponent(jTxtTotalRegi, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblTipoRegistroTrailer)
                    .addComponent(jLblTotaRegi))
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFormatTpRegistroTra, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtTotalRegi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jBtnGravar.setText("Gravar");
        jBtnGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnGravarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnGravar)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 78, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBtnGravar)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTxtNrAutorizacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtNrAutorizacaoActionPerformed

    }//GEN-LAST:event_jTxtNrAutorizacaoActionPerformed

    private void jBtnGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnGravarActionPerformed
        Postilion postilion = new Postilion();
        
        postilion.setTIPO_REG_COND_HEA(jFormatTpRegistroHead.getText());
        postilion.setORIGEM_ARQ_COND_HEA(jComboBoxOrigemArq.getSelectedItem().toString());
        postilion.setCOD_ADQ_COND_HEA(jFormattedTxtCodAdq.getText());
        postilion.setSEQUENCIA_ARQ_COND_HEA(jFormattedTxtSeqArq.getText());
        postilion.setTIME_STAMP_COND_HEA(jFormatedTextDataHoraArq.getText());
        postilion.setTIPO_REG_COND_DET(jFormatTipoRegistroDet.getText());
        postilion.setCOD_TRAN_COND_DET(jFormattedCodTransacao.getText());
        postilion.setMESSAGE_TYPE_COND_DET(jFormattedTpMensagem.getText());
        postilion.setCOD_EC_COND_DET(jFormattedTCodEc.getText());
        postilion.setDT_ORIG_TRAN_COND_DET(jFormattedDtTrnasacao.getText());
        postilion.setHORA_ORIG_TRAN_COND_DET(jTxtHrTransacao.getText());
        postilion.setNSU_TRAN_COND_DET(jTxtNsu.getText());
        postilion.setNUM_PARC_COND_DET(jTxtNrParcela.getText());
        postilion.setQT_TOTL_PARC_COND_DET(jTxtTotParcelas.getText());
        postilion.setNUM_AUTR_TRAN_COND_DET(jTxtNrAutorizacao.getText());
        postilion.setNUM_PLAS_TOKN_COND_DET(jTxtNrCartao.getText());
        postilion.setTID_COND_DET(jTxtNrLogico.getText());
        postilion.setCOD_BAND_COND_DET(jTxtBandeira.getText());
        postilion.setVLR_TRANSACAO_COND_DET(jTxtValor.getText());
        postilion.setCOD_MOED_COND_DET(jTxtMoeda.getText());
        postilion.setCOD_ENTRY_MODE_COND_DET(jTxtModoEntrada.getText());
        postilion.setCOD_MCC_COND_DET(jTxtMcc.getText());
        postilion.setNOME_SOLUCAO_CAP_COND_DET(jTxtSoluCaptura.getText());
        postilion.setTIPO_REG_COND_TRA(jFormatTpRegistroTra.getText());
        postilion.setTOT_REG_ARQ_COND_TRA(jTxtTotalRegi.getText());
        
        if (jComboBoxOrigemArq.getSelectedItem().toString().equals("POSTILION")) {
            JOptionPane.showMessageDialog(null, postilion.postilion());
        } else if (jComboBoxOrigemArq.getSelectedItem().toString().equals("CMM")){
            JOptionPane.showMessageDialog(null, postilion.cmm());
        } else {
            JOptionPane.showMessageDialog(null, postilion.ajustes());
        }
        this.limpacampos(); 
    }//GEN-LAST:event_jBtnGravarActionPerformed


    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GeraArquivo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnGravar;
    private javax.swing.JComboBox<String> jComboBoxOrigemArq;
    private javax.swing.JFormattedTextField jFormatTipoRegistroDet;
    private javax.swing.JFormattedTextField jFormatTpRegistroHead;
    private javax.swing.JFormattedTextField jFormatTpRegistroTra;
    private javax.swing.JFormattedTextField jFormatedTextDataHoraArq;
    private javax.swing.JFormattedTextField jFormattedCodTransacao;
    private javax.swing.JFormattedTextField jFormattedDtTrnasacao;
    private javax.swing.JFormattedTextField jFormattedTCodEc;
    private javax.swing.JFormattedTextField jFormattedTpMensagem;
    private javax.swing.JFormattedTextField jFormattedTxtCodAdq;
    private javax.swing.JFormattedTextField jFormattedTxtSeqArq;
    private javax.swing.JLabel jLblBandeira;
    private javax.swing.JLabel jLblCaptura;
    private javax.swing.JLabel jLblCodAdquirente;
    private javax.swing.JLabel jLblCodEC;
    private javax.swing.JLabel jLblCodTran;
    private javax.swing.JLabel jLblDataHoraArq;
    private javax.swing.JLabel jLblDtTransacao;
    private javax.swing.JLabel jLblHrTransacao;
    private javax.swing.JLabel jLblMCC;
    private javax.swing.JLabel jLblModoEntrada;
    private javax.swing.JLabel jLblMoeda;
    private javax.swing.JLabel jLblNSU;
    private javax.swing.JLabel jLblNrAutorizacao;
    private javax.swing.JLabel jLblNrCartao;
    private javax.swing.JLabel jLblNrLogico;
    private javax.swing.JLabel jLblNrParcela;
    private javax.swing.JLabel jLblOrigemArquivo;
    private javax.swing.JLabel jLblSequenciaArq;
    private javax.swing.JLabel jLblTipoRegistroDet;
    private javax.swing.JLabel jLblTipoRegistroHeader;
    private javax.swing.JLabel jLblTipoRegistroTrailer;
    private javax.swing.JLabel jLblTotParcelas;
    private javax.swing.JLabel jLblTotaRegi;
    private javax.swing.JLabel jLblTpMensagem;
    private javax.swing.JLabel jLblValor;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTxtBandeira;
    private javax.swing.JTextField jTxtHrTransacao;
    private javax.swing.JTextField jTxtMcc;
    private javax.swing.JTextField jTxtModoEntrada;
    private javax.swing.JTextField jTxtMoeda;
    private javax.swing.JTextField jTxtNrAutorizacao;
    private javax.swing.JTextField jTxtNrCartao;
    private javax.swing.JTextField jTxtNrLogico;
    private javax.swing.JTextField jTxtNrParcela;
    private javax.swing.JTextField jTxtNsu;
    private javax.swing.JTextField jTxtSoluCaptura;
    private javax.swing.JTextField jTxtTotParcelas;
    private javax.swing.JTextField jTxtTotalRegi;
    private javax.swing.JTextField jTxtValor;
    // End of variables declaration//GEN-END:variables
}
