namespace Coelho.Arc.Thessaloniki.Helpers
{
    public  class ErrorResponse
    {
        public ErrorResponse()
        {
        }

        public ErrorResponse(string message)
        {
            Message = message;
        }

        public ErrorResponse(string message, string errorCode) : this(message)
        {
            ErrorCode = errorCode;
        }

        public string Message { get; }
        public string ErrorCode { get; }
    }
}
