package com.webank.wecross.stub;

public interface Driver {
    /**
     * Encode an abrstract transaction request.
     *
     * @param request the transaction request
     * @return the encoded transaction request binary data
     */
    public byte[] encodeTransactionRequest(TransactionContext<TransactionRequest> request);

    /**
     * Decode an encoded transaction request binary data.
     *
     * @param data the encoded transaction request binary data
     * @return TransactionRequest
     */
    public TransactionContext<TransactionRequest> decodeTransactionRequest(byte[] data);

    /**
     * Encode an abrstract transaction resonse.
     *
     * @param response the transaction responseh
     * @return the encoded transaction response binary data
     */
    public byte[] encodeTransactionResponse(TransactionResponse response);

    /**
     * Decode an encoded transaction response binary data.
     *
     * @param data the encoded transaction response binary data
     * @return TransactionResponse
     */
    public TransactionResponse decodeTransactionResponse(byte[] data);

    /**
     * Check if the request is transaction
     *
     * @param request
     * @return true if transaction
     */
    public boolean isTransaction(Request request);

    /**
     * Decode an encoded block header binary data.
     *
     * @param data the encoded block header
     * @return BlockHeader
     */
    public BlockHeader decodeBlockHeader(byte[] data);

    /**
     * Call the interface of contract or chaincode
     *
     * @param request the transaction request
     * @return the transaction response
     */
    public TransactionResponse call(
            TransactionContext<TransactionRequest> request, Connection connection);

    /**
     * Send transaction to the interface of contract or chaincode
     *
     * @param request the transaction request
     * @return the transaction response
     */
    public TransactionResponse sendTransaction(
            TransactionContext<TransactionRequest> request, Connection connection);

    /**
     * Get block number
     *
     * @return block number
     */
    public long getBlockNumber(Connection connection);

    /**
     * Get block header
     *
     * @param number
     * @return BlockHeader
     */
    public byte[] getBlockHeader(long number, Connection connection);
}
