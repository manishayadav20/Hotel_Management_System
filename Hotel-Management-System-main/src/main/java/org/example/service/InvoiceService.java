package org.example.service;

import org.example.dao.InvoiceDAO;
import org.example.model.Invoice;

import java.util.List;

public class InvoiceService {
    private InvoiceDAO invoiceDAO = new InvoiceDAO();

    public void saveInvoice(Invoice invoice) {
        invoiceDAO.saveInvoice(invoice);
    }

    // We can Implement other methods if needed:

    public Invoice getInvoiceById(Long id) {
        return invoiceDAO.getInvoiceById(id);
    }

    public List<Invoice> getAllInvoices() {
        return invoiceDAO.getAllInvoices();
    }

    public void updateInvoice(Invoice invoice) {
        invoiceDAO.updateInvoice(invoice);
    }

    public void deleteInvoice(Long id) {
        invoiceDAO.deleteInvoice(id);
    }
}
