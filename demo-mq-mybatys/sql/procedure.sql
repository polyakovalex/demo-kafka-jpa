IF OBJECT_ID('dbo.insert_client ') IS NOT NULL
    BEGIN
        DROP PROCEDURE dbo.insert_client
        IF OBJECT_ID('dbo.insert_client ') IS NOT NULL
            PRINT '<<< FAILED DROPPING PROCEDURE dbo.insert_client  >>>'
        ELSE
            PRINT '<<< DROPPED PROCEDURE dbo.insert_client  >>>'
    END
GO


CREATE PROCEDURE [dbo].[insert_client]
            @p_name VARCHAR(25),
            @p_last_name VARCHAR(25)
AS

INSERT INTO dbo.client
(name, lastName)
VALUES(@p_name, @p_last_name);


GO

IF OBJECT_ID('dbo.insert_client ') IS NOT NULL
    PRINT '<<< CREATED PROCEDURE dbo.insert_client  >>>'
ELSE
    PRINT '<<< FAILED CREATING PROCEDURE dbo.insert_client  >>>'
GO

-- GRANT EXECUTE ON dbo.insert_client TO public
GO  