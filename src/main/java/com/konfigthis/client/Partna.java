package com.konfigthis.client;

import com.konfigthis.client.api.ApiKeyApi;
import com.konfigthis.client.api.BalanceApi;
import com.konfigthis.client.api.BankApi;
import com.konfigthis.client.api.BankAccountApi;
import com.konfigthis.client.api.CurrencyApi;
import com.konfigthis.client.api.MerchantsApi;
import com.konfigthis.client.api.MockPaymentApi;
import com.konfigthis.client.api.PaymentApi;
import com.konfigthis.client.api.RatesApi;
import com.konfigthis.client.api.TransactionApi;
import com.konfigthis.client.api.TransactionsApi;
import com.konfigthis.client.api.VoucherApi;
import com.konfigthis.client.api.VoucherFeeApi;
import com.konfigthis.client.api.VoucherMinMaxAmountApi;
import com.konfigthis.client.api.WalletApi;
import com.konfigthis.client.api.WebhookApi;

public class Partna {
    private ApiClient apiClient;
    public final ApiKeyApi apiKey;
    public final BalanceApi balance;
    public final BankApi bank;
    public final BankAccountApi bankAccount;
    public final CurrencyApi currency;
    public final MerchantsApi merchants;
    public final MockPaymentApi mockPayment;
    public final PaymentApi payment;
    public final RatesApi rates;
    public final TransactionApi transaction;
    public final TransactionsApi transactions;
    public final VoucherApi voucher;
    public final VoucherFeeApi voucherFee;
    public final VoucherMinMaxAmountApi voucherMinMaxAmount;
    public final WalletApi wallet;
    public final WebhookApi webhook;

    public Partna() {
        this(null);
    }

    public Partna(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.apiKey = new ApiKeyApi(this.apiClient);
        this.balance = new BalanceApi(this.apiClient);
        this.bank = new BankApi(this.apiClient);
        this.bankAccount = new BankAccountApi(this.apiClient);
        this.currency = new CurrencyApi(this.apiClient);
        this.merchants = new MerchantsApi(this.apiClient);
        this.mockPayment = new MockPaymentApi(this.apiClient);
        this.payment = new PaymentApi(this.apiClient);
        this.rates = new RatesApi(this.apiClient);
        this.transaction = new TransactionApi(this.apiClient);
        this.transactions = new TransactionsApi(this.apiClient);
        this.voucher = new VoucherApi(this.apiClient);
        this.voucherFee = new VoucherFeeApi(this.apiClient);
        this.voucherMinMaxAmount = new VoucherMinMaxAmountApi(this.apiClient);
        this.wallet = new WalletApi(this.apiClient);
        this.webhook = new WebhookApi(this.apiClient);
    }

}
