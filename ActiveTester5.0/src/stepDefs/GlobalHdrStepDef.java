/**
 * Copyright 2019 HCL Technologies Limited. All Rights Reserved.
 */

package stepdefs.core;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import elems.GenElem;
import org.apache.log4j.Logger;
import pages.core.GlobalHeader;
import pages.core.ResultsToolbarPanel;
import util.ErrorCodes;
import util.GlobalVariable;
import util.SeleniumUtil;
import util.Util;

/**
 * This class has definition for all the steps which are related to the operation we are going to perform on the Global
 * header components
 */
public class GlobalHdrStepDef
{

    /**
     * Logger for this class
     */
    static Logger mLog = Logger.getLogger( GlobalHdrStepDef.class );

    /**
     * Constructor
     *
     * @unpublished
     */
    public GlobalHdrStepDef()
    {
        super();
        GlobalHdrStepDef.mLog.trace( "Start of GlobalHdrStepDef()" );
        GlobalHdrStepDef.mLog.trace( "End of GlobalHdrStepDef()" );
    }

    /**
     * Step definition to click on the Advanced Search link just below the global search box. It is assumed that
     * Advanced Search Link is already visible.
     *
     * @param stepId ID of this step
     * @throws Throwable throws exception if any error
     * @unpublished
     */
    @And( "^\"([^\"]*)\" Click on Advanced Search link under global search box$" )
    public void click_on_advance_search_link_under_global_search_box( String stepId )
        throws Throwable
    {
        GlobalHdrStepDef.mLog.trace(
                "Start of public void i_click_on_advance_search_link_under_global_search_box( String stepId )" );
        //Start block
        Util.logStepDefStart( GlobalHdrStepDef.mLog, stepId );
        GlobalHdrStepDef.mLog.info( stepId + " I click on Advanced Search link under global search box" );
        int err = 0;

        //Implementation block
        try
        {
            GlobalHeader glbHeaderPg = GlobalHeader.getInstance();
            glbHeaderPg.mAdvSearchLink.findElem( glbHeaderPg.mDriver, glbHeaderPg.mTimeOutMed, glbHeaderPg.mMaxRetry );
            glbHeaderPg.mAdvSearchLink.click( glbHeaderPg.mDriver, glbHeaderPg.mTimeOutMed, glbHeaderPg.mMaxRetry );
        }
        catch( Exception ex )
        {
            err = ErrorCodes.FAILED_WITH_EXCEPTION;
        }

        //end block
        Util.logStepDefEnd( GlobalHdrStepDef.mLog, stepId, err );
    }

    /**
     * This step definition will click on BreadCrumb next to object.
     *
     * @param stepId ID of the test step
     * @param ItemNm -Name of the item after which the chevron needs to be clicked
     * @throws Throwable Exception in case of error
     */
    @Then( "^\"([^\"]*)\" Click on breadcrumb chevron next to \"([^\"]*)\" object$" )
    public void click_on_breadcrumb_chevron_next_to_object( String stepId, String ItemNm )
        throws Throwable
    {
        //Start block
        GlobalHdrStepDef.mLog.trace(
                "Starting of StepDef public i_click_on_breadcrumb_chevron_next_to( String stepId, String ItNm )" );
        Util.logStepDefStart( GlobalHdrStepDef.mLog, stepId );
        GlobalHdrStepDef.mLog.info( stepId + "Click on breadcrumb chevron next to " + ItemNm + " object" );
        int err = 0;

        GlobalVariable glbVar = GlobalVariable.getInstance();
        //Added for variable support
        ItemNm = ItemNm.contains( "$(" ) ? glbVar.getVariableValue( ItemNm ) : ItemNm;

        //Implementation block
        try
        {
            GlobalHeader glbHeaderPg = GlobalHeader.getInstance();
            err = glbHeaderPg.ClickChevronNextTo( ItemNm );
        }
        catch( Exception ex )
        {
            GlobalHdrStepDef.mLog.error( Util.getCompleteStackTraceInfo( ex ) );
            err = ErrorCodes.FAILED_WITH_EXCEPTION;
        }

        //end block
        Util.logStepDefEnd( GlobalHdrStepDef.mLog, stepId, err );
    }

    /**
     * This step definition will verify on right compare table if particular command available.
     *
     * @param stepId ID of the test step
     * @param cmdNm Name of the command to be verified
     * @throws Throwable Exception in case of error
     */
    @Then( "^\"([^\"]*)\" Click on \"([^\"]*)\" command right compare table$" )
    public void click_on_command_in_right_compare_table( String stepId, String cmdNm )
        throws Throwable
    {
        //Start block
        GlobalHdrStepDef.mLog.trace(
                "Starting of StepDef public click_on_command_in_right_compare_table( String stepId, String cmdNm )" );
        Util.logStepDefStart( GlobalHdrStepDef.mLog, stepId );
        GlobalHdrStepDef.mLog.info( stepId + " Click on " + cmdNm + " command in right compare table" );
        int err = 0;

        GlobalVariable glbVar = GlobalVariable.getInstance();
        //Added for variable support
        cmdNm = cmdNm.contains( "$(" ) ? glbVar.getVariableValue( cmdNm ) : cmdNm;

        //Implementation block
        try
        {
            GlobalHeader glbHeaderPg = GlobalHeader.getInstance();
            glbHeaderPg.clickOnCommandInRightCompareTable( cmdNm );
        }
        catch( Exception ex )
        {
            GlobalHdrStepDef.mLog.error( Util.getCompleteStackTraceInfo( ex ) );
            err = ErrorCodes.FAILED_WITH_EXCEPTION;
        }

        //end block
        Util.logStepDefEnd( GlobalHdrStepDef.mLog, stepId, err );
    }

    /**
     * Step definition to click on the Expand Search Bar icon in global Header. This is added in AWC 4.1. Clciking on
     * this expands/toogles the Global Search Box It is assumed that Expand Search Bar Icon is visible
     *
     * @author Vipul Singhal
     * @param stepId ID of this step
     * @throws Throwable throws exception if any error
     * @unpublished
     */
    @And( "^\"([^\"]*)\" Click on Expand Search Box icon in global header$" )
    public void click_on_expand_search_box_icon_in_global_header( String stepId )
        throws Throwable
    {
        GlobalHdrStepDef.mLog.trace(
                "Start of public void click_on_expand_search_box_icon_in_global_header( String stepId )" );
        //Start block
        Util.logStepDefStart( GlobalHdrStepDef.mLog, stepId );
        GlobalHdrStepDef.mLog.info( stepId + " Click on Expand Search Box icon in global header" );
        int err = 0;

        //Implementation block
        try
        {
            GlobalHeader glbHeaderPg = GlobalHeader.getInstance();
            glbHeaderPg.mExpSrchBoxIcon.findElem( glbHeaderPg.mDriver, glbHeaderPg.mTimeOutMed, glbHeaderPg.mMaxRetry );
            glbHeaderPg.mExpSrchBoxIcon.click( glbHeaderPg.mDriver, glbHeaderPg.mTimeOutMed, glbHeaderPg.mMaxRetry );
        }
        catch( Exception ex )
        {
            err = ErrorCodes.FAILED_WITH_EXCEPTION;
        }

        //end block
        Util.logStepDefEnd( GlobalHdrStepDef.mLog, stepId, err );
    }

    /**
     * Step definition to find and select show children command on object from breadcrumb popup
     *
     * @param stepId ID of this step
     * @param objectNm Object Name to be selcted
     * @param cmdNm Command Name to be selcted
     * @throws Throwable throws exception if any error
     * @author Abhishek Bavalekar
     * @unpublished
     */

    @Then( "^\"([^\"]*)\" Click on \"([^\"]*)\" for item with name \"([^\"]*)\" from breadcrumb popup$" )
    public void click_on_for_item_with_name_from_bread_crumb_popup( String stepId, String cmdNm, String objectNm )
        throws Throwable
    {

        GlobalHdrStepDef.mLog.trace(
                "Start of public void click_on_for_item_with_name_from_breadcrumb_popup( String stepId, String cmdNm, String objectNm )" );
        //Start block
        Util.logStepDefStart( GlobalHdrStepDef.mLog, stepId );
        GlobalHdrStepDef.mLog.info(
                stepId + " Click on " + cmdNm + " for item with name " + objectNm + " from breadcrumb pop-up " );
        int err = 0;

        GlobalVariable glbVar = GlobalVariable.getInstance();
        //Added for variable support
        objectNm = objectNm.contains( "$(" ) ? glbVar.getVariableValue( objectNm ) : objectNm;

        //Implementation block
        try
        {
            GlobalHeader glbHeaderPg = GlobalHeader.getInstance();
            //Select command next to Item on Breadcrumb Popup
            glbHeaderPg.clickOnCmdNxtToObjOnBreadCrumbPopUp( objectNm, cmdNm );
        }
        catch( Exception ex )
        {
            GlobalHdrStepDef.mLog.error( Util.getCompleteStackTraceInfo( ex ) );
            err = ErrorCodes.FAILED_WITH_EXCEPTION;
        }

        //end block
        Util.logStepDefEnd( GlobalHdrStepDef.mLog, stepId, err );

    }

    /**
     * @param stepId ID of the test step
     * @param category Name of the category
     * @throws Throwable Exception in case of error
     * @unpublished
     */
    @Given( "^\"([^\"]*)\" Click on Global Search Category link and select \"([^\"]*)\"$" )
    public void click_on_Global_Search_Category_link_and_select( String stepId, String category )
        throws Throwable
    {
        GlobalHdrStepDef.mLog.trace(
                "public void click_on_Global_Search_Category_link_and_select( String stepId, String category )" );

        //Start block
        Util.logStepDefStart( GlobalHdrStepDef.mLog, stepId );
        GlobalHdrStepDef.mLog.info( stepId + " Click on Global Search Category link and select " + category );
        int err = 0;

        GlobalVariable glbVar = GlobalVariable.getInstance();
        //Added for variable support
        category = category.contains( "$(" ) ? glbVar.getVariableValue( category ) : category;

        //Implementation block
        try
        {
            GlobalHeader glbHeaderPg = GlobalHeader.getInstance();
            err = glbHeaderPg.setCategory( category );
        }
        catch( Exception ex )
        {
            err = ErrorCodes.FAILED_WITH_EXCEPTION;
        }

        //end block
        Util.logStepDefEnd( GlobalHdrStepDef.mLog, stepId, err );
    }

    /**
     * This step has variable support.
     *
     * @param stepId ID of this step
     * @param owner Value for the owner. Should be either Any or me
     * @throws Throwable throws exception if any error
     * @unpublished
     */
    @Given( "^\"([^\"]*)\" Click on Global Search Owner link and selects \"([^\"]*)\"$" )
    public void click_on_Global_Search_Owner_link_and_selects( String stepId, String owner )
        throws Throwable
    {
        GlobalHdrStepDef.mLog.trace(
                "public void i_click_on_Global_Search_Owner_link_and_selects( String stepId, String owner )" );

        //Start block
        Util.logStepDefStart( GlobalHdrStepDef.mLog, stepId );
        GlobalHdrStepDef.mLog.info( stepId + " I click on Global Search Owner link and selects " + owner );
        int err = 0;

        GlobalVariable glbVar = GlobalVariable.getInstance();
        //Added for variable support
        owner = owner.contains( "$(" ) ? glbVar.getVariableValue( owner ) : owner;

        //Implementation block
        try
        {
            GlobalHeader glbHeaderPg = GlobalHeader.getInstance();
            err = glbHeaderPg.setOwner( owner );
        }
        catch( Exception ex )
        {
            err = ErrorCodes.FAILED_WITH_EXCEPTION;
        }

        //end block
        Util.logStepDefEnd( GlobalHdrStepDef.mLog, stepId, err );
    }

    /**
     * Click on Revision rule and have to select the revision rule one which is specified by user
     *
     * @param stepId ID ID of this step
     * @param revRule Revision rule to be clicked on
     * @throws Throwable Throwable Exception
     * @unpublished
     */
    @Given( "^\"([^\"]*)\" Click on Global search revision link and select revision rule \"([^\"]*)\"$" )
    public void Click_on_Global_search_revision_link_and_select_revision_rule( String stepId, String revRule )
        throws Throwable
    {
        GlobalHdrStepDef.mLog.trace(
                "Start of public void Click_on_Global_search_revision_link_and_select_revision_rule( String stepId )" );
        //Start block
        Util.logStepDefStart( GlobalHdrStepDef.mLog, stepId );
        GlobalHdrStepDef.mLog.info( stepId + " I click on Rivision Rule link under global search box" );
        int err = 0;
        GenElem obj = null;

        //Implementation block
        try
        {
            GlobalHeader glbHeaderPg = GlobalHeader.getInstance();
            glbHeaderPg.mRevisionRule.findElem( glbHeaderPg.mDriver, glbHeaderPg.mTimeOutMed, glbHeaderPg.mMaxRetry );
            glbHeaderPg.mRevisionRule.click( glbHeaderPg.mDriver, glbHeaderPg.mTimeOutMed, glbHeaderPg.mMaxRetry );
            obj = glbHeaderPg.findRevRule( revRule );
            obj.click( glbHeaderPg.mDriver, glbHeaderPg.mTimeOutMed, glbHeaderPg.mMaxRetry );

        }
        catch( Exception ex )
        {
            err = ErrorCodes.FAILED_WITH_EXCEPTION;
        }

        //end block
        Util.logStepDefEnd( GlobalHdrStepDef.mLog, stepId, err );
    }

    /**
     * This stepdef will click on the chevron next to given value is present in the breadcrumb of column in compare
     * table. It is assumed that two items are opened in compare mode to click on the chevron next to value in
     * breadcrumb.
     *
     * @param stepId Id of the step
     * @param value Value next to which chevron to be clicked
     * @param columnName Name of the column from which chevron to be clicked
     * @throws Throwable Throws exception in case of any error
     */
    @Then( "^\"([^\"]*)\" Click on breadcrumb chevron next to \"([^\"]*)\" from \"([^\"]*)\" column of compare table$" )
    public void clickOnBreadcrumbChevronNextToValueFromColumnInComparetable( String stepId, String value,
            String columnName )
        throws Throwable
    {
        //Start block
        GlobalHdrStepDef.mLog.trace(
                "Starting of StepDef public clickOnBreadcrumbChevronNextToValueFromLeftComparetable( String stepId, String value )throws Throwable" );
        Util.logStepDefStart( GlobalHdrStepDef.mLog, stepId );
        GlobalHdrStepDef.mLog.info( stepId + " Click on breadcrumb chevron next to  " + value + " from " + columnName
                + " column of compare table" );
        int err = 0;

        GlobalVariable glbVar = GlobalVariable.getInstance();
        //Added for variable support
        value = value.contains( "$(" ) ? glbVar.getVariableValue( value ) : value;
        columnName = columnName.contains( "$(" ) ? glbVar.getVariableValue( columnName ) : columnName;

        //Implementation block
        try
        {
            GlobalHeader glbHeaderPg = GlobalHeader.getInstance();
            err = glbHeaderPg.clickOnChevronNextToValueInBreadcrumbForColumnInCompareTable( value, columnName );
        }
        catch( Exception ex )
        {
            GlobalHdrStepDef.mLog.error( Util.getCompleteStackTraceInfo( ex ) );
            err = ErrorCodes.FAILED_WITH_EXCEPTION;
        }

        //end block
        Util.logStepDefEnd( GlobalHdrStepDef.mLog, stepId, err );
    }

    //Jalaj's implementation for Submitted tab
    /**
     * This step will click on Submitted tab, in the global header.
     *
     * @param stepId ID of the test step
     * @param tabName Name of Tab
     * @throws Throwable Exception in case of error
     * @unpublished
     */

    @Then( "^\"([^\"]*)\" In the global header, select the \"([^\"]*)\" tab$" )
    public void in_the_global_header_select_the_tab( String stepId, String tabName )
        throws Throwable
    {
        //Start block
        GlobalHdrStepDef.mLog.trace(
                "Starting of StepDef public void in_the_global_header_select_the_tab( String stepId, String tabName )" );
        Util.logStepDefStart( GlobalHdrStepDef.mLog, stepId );
        GlobalHdrStepDef.mLog.info( stepId + "In the global header, select the" + tabName + " tab" );

        int err = 0;

        GlobalVariable glbVar = GlobalVariable.getInstance();
        //Added for variable support
        tabName = tabName.contains( "$(" ) ? glbVar.getVariableValue( tabName ) : tabName;

        //Implementation block
        try
        {
            GlobalHeader glbHeaderPg = GlobalHeader.getInstance();
            err = glbHeaderPg.openTab( tabName );
            // boolean flag = glbHeaderPg.verifyCategoryList( tabName );
        }
        catch( Exception ex )
        {
            err = ErrorCodes.FAILED_WITH_EXCEPTION;
        }

        //end block
        Util.logStepDefEnd( GlobalHdrStepDef.mLog, stepId, err );
    }

    /**
     * Step definition to click on the page Title in global Header.
     *
     * @param stepId ID of this step
     * @param breadCrumb Location which need to be clicked
     * @throws Throwable throws exception if any error
     * @unpublished
     */

    @Then( "^\"([^\"]*)\" On global header click on \"([^\"]*)\"$" )
    public void on_global_header_click_on( String stepId, String breadCrumb )
        throws Throwable
    {

        GlobalHdrStepDef.mLog.trace(
                "Start of public void on_global_header_click_on(String stepId, String breadCrumb)" );
        //Start block
        Util.logStepDefStart( GlobalHdrStepDef.mLog, stepId );
        GlobalHdrStepDef.mLog.info( stepId + " On global header click on " + breadCrumb );
        int err = 0;

        GlobalVariable glbVar = GlobalVariable.getInstance();
        //Added for variable support
        breadCrumb = breadCrumb.contains( "$(" ) ? glbVar.getVariableValue( breadCrumb ) : breadCrumb;

        //Implementation block
        try
        {
            GlobalHeader glbHeaderPg = GlobalHeader.getInstance();
            glbHeaderPg.clickOnPageTitleBreadCrumb( breadCrumb );
        }
        catch( Exception ex )
        {
            GlobalHdrStepDef.mLog.error( Util.getCompleteStackTraceInfo( ex ) );
            err = ErrorCodes.FAILED_WITH_EXCEPTION;
        }

        //end block
        Util.logStepDefEnd( GlobalHdrStepDef.mLog, stepId, err );
    }

    /**
     * This stepdef is used to set value of the label present in the global header. label cab be
     * Revision,Units,Varinants. It is assuemd that the labels are present in global header to set its value, and while
     * setting Effectivity date format should me DD-MMM-YYYY.
     *
     * @param stepId ID of the test step
     * @param labelName Label name for which value to be verified
     * @param value Value to be set
     * @throws Throwable throws exception in case of error
     */
    @Then( "^\"([^\"]*)\" On global header set \"([^\"]*)\" value to \"([^\"]*)\"$" )
    public void OnGlobalHeaderSetLabelValue( String stepId, String labelName, String value )
        throws Throwable
    {
        //Start block
        GlobalHdrStepDef.mLog.trace(
                "Starting of StepDef public OnGlobalHeaderSetLabelValue( String stepId, String labelName, String value )" );
        Util.logStepDefStart( GlobalHdrStepDef.mLog, stepId );
        GlobalHdrStepDef.mLog.info( stepId + " On Global header set  " + labelName + " to " + value );
        int err = 0;

        GlobalVariable glbVar = GlobalVariable.getInstance();
        //Added for variable support
        labelName = labelName.contains( "$(" ) ? glbVar.getVariableValue( labelName ) : labelName;
        value = value.contains( "$(" ) ? glbVar.getVariableValue( value ) : value;

        try
        {
            //Implementation block
            GlobalHeader glbHeaderPg = GlobalHeader.getInstance();
            err = glbHeaderPg.setLabelValue( labelName, value );
        }
        catch( Exception ex )
        {
            GlobalHdrStepDef.mLog.error( Util.getCompleteStackTraceInfo( ex ) );
            err = ErrorCodes.FAILED_WITH_EXCEPTION;
        }
        GlobalHeader.getInstance().isProgressBarGone();
        //end block
        Util.logStepDefEnd( GlobalHdrStepDef.mLog, stepId, err );
    }

    //Jalaj's implementation for Submitted tab ends here

    /**
     * This stepdef is used to verify value of end item for the label present in the global header. label cab be
     * Effetivity,Revision,Units etc.
     *
     * @param stepId ID of the test step
     * @param labelName Label name for which value to be validated
     * @param itemName Name of the end item which is used for validation
     * @throws Throwable Throwable Exception
     */
    @Then( "^\"([^\"]*)\" On global header validate end item of \"([^\"]*)\" is \"([^\"]*)\"$" )
    public void OnGlobalHeaderValidateEndItem( String stepId, String labelName, String itemName )
        throws Throwable
    {
        //Start block
        GlobalHdrStepDef.mLog.trace(
                "Starting of StepDef public OnGlobalHeaderValidateEndItem( String stepId, String labelName,String mode,String expectedValue )" );
        Util.logStepDefStart( GlobalHdrStepDef.mLog, stepId );
        GlobalHdrStepDef.mLog.info(
                stepId + " On Global header validate end item of   " + labelName + " is " + itemName );
        int err = 0;

        GlobalVariable glbVar = GlobalVariable.getInstance();
        //Added for variable support
        labelName = labelName.contains( "$(" ) ? glbVar.getVariableValue( labelName ) : labelName;
        itemName = itemName.contains( "$(" ) ? glbVar.getVariableValue( itemName ) : itemName;

        try
        {
            //Implementation block
            GlobalHeader glbHeaderPg = GlobalHeader.getInstance();
            err = glbHeaderPg.validateEndItem( labelName, itemName );

            if( err != 0 )
            {
                GlobalHdrStepDef.mLog.info( "Validated failed" );
            }
            else
            {
                GlobalHdrStepDef.mLog.info( "Validation successfully" );
            }
        }
        catch( Exception ex )
        {
            GlobalHdrStepDef.mLog.error( Util.getCompleteStackTraceInfo( ex ) );
            err = ErrorCodes.FAILED_WITH_EXCEPTION;
        }

        //end block
        Util.logStepDefEnd( GlobalHdrStepDef.mLog, stepId, err );
    }

    /**
     * This stepdef is used to verify value of the label present in the global header. label cab be
     * Effetivity,Revision,Units etc. It is assuemd that the labels are present in global header to verify its value
     *
     * @param stepId ID of the test step
     * @param labelName Label name for which value to be verified
     * @param mode Mode value can be be or not be to check both positive and negative case
     * @param expectedValue Expected value of the label
     * @throws Throwable Throwable Exception
     */
    @Then( "^\"([^\"]*)\" On global header \"([^\"]*)\" should \"([^\"]*)\" \"([^\"]*)\"$" )
    public void OnGlobalHeaderValidateLabelValue( String stepId, String labelName, String mode, String expectedValue )
        throws Throwable
    {
        //Start block
        GlobalHdrStepDef.mLog.trace(
                "Starting of StepDef public voidOnGlobalHeaderValidateLabelValue( String stepId, String labelName,String mode,String expectedValue )" );
        Util.logStepDefStart( GlobalHdrStepDef.mLog, stepId );
        GlobalHdrStepDef.mLog.info(
                stepId + " On Global header  " + labelName + " should " + mode + " " + expectedValue );
        int err = 0;

        GlobalVariable glbVar = GlobalVariable.getInstance();
        //Added for variable support
        labelName = labelName.contains( "$(" ) ? glbVar.getVariableValue( labelName ) : labelName;
        mode = mode.contains( "$(" ) ? glbVar.getVariableValue( mode ) : mode;
        expectedValue = expectedValue.contains( "$(" ) ? glbVar.getVariableValue( expectedValue ) : expectedValue;

        try
        {
            //Implementation block
            GlobalHeader glbHeaderPg = GlobalHeader.getInstance();
            err = glbHeaderPg.verifyLabelValue( labelName, mode, expectedValue );

            if( err > 0 )
            {
                GlobalHdrStepDef.mLog.info( "verified failed" );
            }
            else
            {
                GlobalHdrStepDef.mLog.info( "verification successfully" );
            }
        }
        catch( Exception ex )
        {
            GlobalHdrStepDef.mLog.error( Util.getCompleteStackTraceInfo( ex ) );
            err = ErrorCodes.FAILED_WITH_EXCEPTION;
        }

        //end block
        Util.logStepDefEnd( GlobalHdrStepDef.mLog, stepId, err );
    }

    /**
     * This stepdef is used to validate given Revision Rule should not be present in the list
     *
     * @author shweta_sa
     * @param stepId - ID of the test step
     * @param revRule - Revision rule name which we need to check in the list
     * @throws Throwable - Throwable Exception in case of error
     */
    @Then( "^\"([^\"]*)\" Revision rule \"([^\"]*)\" should not be visible in list$" )
    public void revision_rule_should_not_be_visible_in_list( String stepId, String revRule )
        throws Throwable
    {
        //Start block
        GlobalHdrStepDef.mLog.trace(
                "Starting of StepDef public void revision_rule_should_not_be_present_in_list( String stepId, String revRule )" );
        Util.logStepDefStart( GlobalHdrStepDef.mLog, stepId );
        GlobalHdrStepDef.mLog.info( stepId + "Revision rule " + revRule + " should not be visible in list" );
        int err = 0;
        GlobalVariable glbVar = GlobalVariable.getInstance();
        //Added for variable support
        revRule = revRule.contains( "$(" ) ? glbVar.getVariableValue( revRule ) : revRule;

        //Implementation block

        try
        {
            GlobalHeader glbHeaderPg = GlobalHeader.getInstance();
            glbHeaderPg.mRevisionRule.findElem( glbHeaderPg.mDriver, glbHeaderPg.mTimeOutMed, glbHeaderPg.mMaxRetry );
            glbHeaderPg.mRevisionRule.click( glbHeaderPg.mDriver, glbHeaderPg.mTimeOutMed, glbHeaderPg.mMaxRetry );
        }
        catch( Exception ex )
        {
            err = ErrorCodes.FAILED_WITH_EXCEPTION;
            throw ex;
        }
        Thread.sleep( 1000 );

        GlobalHeader glbHeaderPg = GlobalHeader.getInstance();
        Boolean flag = glbHeaderPg.verifyRevisionRule( revRule );

        if( flag == true )
        {
            GlobalHdrStepDef.mLog.info( "The Revision Rule " + revRule + " is not visible in the list" );
        }
        else
        {
            GlobalHdrStepDef.mLog.error( "The Revision Rule " + revRule + " is visible in the list" );
            err = ErrorCodes.STEP_HAS_FAILED;
        }

        //end block
        Util.logStepDefEnd( GlobalHdrStepDef.mLog, stepId, err );

    }

    /**
     * This step def is used to search the provided string and select in Global Search Textbox.
     * 
     * @param stepId Id of step
     * @param searchStr String to search on Global Search Textbox
     * @throws Throwable Throws exception in case of any error
     * @unpublished
     */
    @Given( "^\"([^\"]*)\" Search and select \"([^\"]*)\" in the Global Search Textbox$" )
    public void search_and_select_in_the_Global_Search_Textbox( String stepId, String searchStr )
        throws Throwable
    {
        GlobalHdrStepDef.mLog.trace(
                "public void i_search_by_in_the_Global_Search_Textbox( String stepId, String searchStr )" );
        //Start block
        Util.logStepDefStart( GlobalHdrStepDef.mLog, stepId );
        GlobalHdrStepDef.mLog.info( stepId + " I search by '" + searchStr + "' in the Global Search Textbox" );
        int err = 0;

        GlobalVariable glbVar = GlobalVariable.getInstance();
        //Added for variable support
        searchStr = searchStr.contains( "$(" ) ? glbVar.getVariableValue( searchStr ) : searchStr;

        //Implementation block
        try
        {
            GlobalHeader glbHeaderPg = GlobalHeader.getInstance();
            err = glbHeaderPg.globalSearch( searchStr );

            //instantiate object of LeftNavBarPanel class
            ResultsToolbarPanel resultTBarPnl = ResultsToolbarPanel.getInstance();

            //find the object
            GenElem resultObj = resultTBarPnl.findObjInNavBar( 1 );
            err = resultTBarPnl.selectObjInNavBar( resultObj );
        }
        catch( Exception ex )
        {
            err = ErrorCodes.FAILED_WITH_EXCEPTION;
        }

        //end block
        Util.logStepDefEnd( GlobalHdrStepDef.mLog, stepId, err );
    }

    /**
     * This step has variable support.
     *
     * @param stepId ID of this step
     * @param searchStr Simple string to search by.
     * @throws Throwable throws exception if any error
     * @unpublished
     */
    @Given( "^\"([^\"]*)\" Search by \"([^\"]*)\" in the Global Search Textbox$" )
    public void search_by_in_the_Global_Search_Textbox( String stepId, String searchStr )
        throws Throwable
    {
        GlobalHdrStepDef.mLog.trace(
                "public void i_search_by_in_the_Global_Search_Textbox( String stepId, String searchStr )" );
        //Start block
        Util.logStepDefStart( GlobalHdrStepDef.mLog, stepId );
        GlobalHdrStepDef.mLog.info( stepId + " I search by '" + searchStr + "' in the Global Search Textbox" );
        int err = 0;

        GlobalVariable glbVar = GlobalVariable.getInstance();
        //Added for variable support
        searchStr = searchStr.contains( "$(" ) ? glbVar.getVariableValue( searchStr ) : searchStr;

        //Implementation block
        try
        {
            GlobalHeader glbHeaderPg = GlobalHeader.getInstance();
            err = glbHeaderPg.globalSearch( searchStr );
        }
        catch( Exception ex )
        {
            err = ErrorCodes.FAILED_WITH_EXCEPTION;
        }

        //end block
        Util.logStepDefEnd( GlobalHdrStepDef.mLog, stepId, err );
    }

    /**
     * This step will search for the given string in the Global search textbox and Selects the result which is at
     * specified index from Result Toolbar Panel.
     *
     * @param stepId ID of this step
     * @param searchStr Simple string to search by.
     * @param itemIndex Position of the item in the search results, which is to be clicked
     * @throws Throwable throws exception if any error
     * @author Abhishek Bavalekar
     * @unpublished
     */
    @Then( "^\"([^\"]*)\" Search by \"([^\"]*)\" in the Global Search Textbox and select \"([^\"]*)\" item$" )
    public void search_by_in_the_Global_Search_Textbox_and_select_item( String stepId, String searchStr,
            String itemIndex )
        throws Throwable
    {
        GlobalHdrStepDef.mLog.trace(
                "public void search_by_in_the_Global_Search_Textbox_and_select_item( String stepId, String searchStr, String itemIndex )" );
        //Start block
        Util.logStepDefStart( GlobalHdrStepDef.mLog, stepId );
        GlobalHdrStepDef.mLog.info( stepId + " Search by " + searchStr + " in the Global Search Textbox and select "
                + itemIndex + " item" );
        int err = 0;

        //Added for variable support
        GlobalVariable glbVar = GlobalVariable.getInstance();
        searchStr = searchStr.contains( "$(" ) ? glbVar.getVariableValue( searchStr ) : searchStr;
        itemIndex = itemIndex.contains( "$(" ) ? glbVar.getVariableValue( itemIndex ) : itemIndex;

        try
        {
            GlobalHeader glbHeaderPg = GlobalHeader.getInstance();
            SeleniumUtil selUtil = SeleniumUtil.getInstance();
            ResultsToolbarPanel resultTBarPnl = ResultsToolbarPanel.getInstance();

            int MaxRetry = selUtil.mMaxRetry;
            int count;
            for( count = 0; count <= MaxRetry; count++ )
            {
                err = glbHeaderPg.globalSearch( searchStr );
                try
                {
                    //Implementation block
                    //convert itemIndex string to an integer
                    String index = itemIndex.substring( 0, itemIndex.length() - 2 );
                    int ind = Integer.parseInt( index );
                    //find the object
                    GenElem resultObj = resultTBarPnl.findObjInNavBar( ind );
                    if( resultObj != null )
                    {
                        resultTBarPnl.selectObjInNavBar( resultObj );
                        ResultsToolbarPanelStepDef.mLog.info( "Search by " + searchStr + " is found." );
                        err = 0;
                        break;
                    }
                }
                catch( Exception ex )
                {
                    ResultsToolbarPanelStepDef.mLog.info( "Search by " + searchStr + " is NOT found." );
                    ResultsToolbarPanelStepDef.mLog.error( Util.getCompleteStackTraceInfo( ex ) );
                    err = ErrorCodes.FAILED_WITH_EXCEPTION;
                }
            }
        }
        catch( Exception ex )
        {
            err = ErrorCodes.FAILED_WITH_EXCEPTION;
        }
        //end block
        Util.logStepDefEnd( GlobalHdrStepDef.mLog, stepId, err );
    }

    /**
     * Step definition to find and select object from breadcrumb popup
     *
     * @param stepId ID of this step
     * @param objectNm Object Name to be selcted
     * @throws Throwable throws exception if any error
     * @author Abhishek Bavalekar
     * @unpublished
     */

    @Then( "^\"([^\"]*)\" Select item with name as \"([^\"]*)\" from breadcrumb pop-up$" )
    public void select_item_with_name_as_from_breadcrumb_pop_up( String stepId, String objectNm )
        throws Throwable
    {

        GlobalHdrStepDef.mLog.trace(
                "Start of public void select_item_with_name_as_from_breadcrumb_pop_up(String stepId, String objectNm)" );
        //Start block
        Util.logStepDefStart( GlobalHdrStepDef.mLog, stepId );
        GlobalHdrStepDef.mLog.info( stepId + " Select item with name as " + objectNm + " from breadcrumb pop-up " );
        int err = 0;

        GlobalVariable glbVar = GlobalVariable.getInstance();
        //Added for variable support
        objectNm = objectNm.contains( "$(" ) ? glbVar.getVariableValue( objectNm ) : objectNm;

        //Implementation block
        try
        {
            GlobalHeader glbHeaderPg = GlobalHeader.getInstance();
            glbHeaderPg.selectItemOnBreadCrumbPopUp( objectNm );
        }
        catch( Exception ex )
        {
            GlobalHdrStepDef.mLog.error( Util.getCompleteStackTraceInfo( ex ) );
            err = ErrorCodes.FAILED_WITH_EXCEPTION;
        }

        //end block
        Util.logStepDefEnd( GlobalHdrStepDef.mLog, stepId, err );

    }

    /**
     * This stepdef will verify the count of breadcrumb separators column in compare table. It is assumed that two items
     * are opened in compare mode to verify the count of breadcrumb separators.
     *
     * @param stepId Id of the step
     * @param count Count of the crumb separators
     * @param columnName Name of the column from which chevron to be clicked
     * @throws Throwable Throws exception in case of any error
     */
    @Then( "^\"([^\"]*)\" The Breadcrumb should contain \"([^\"]*)\" crumb separators from \"([^\"]*)\" column of compare table$" )
    public void TheBreadcrumbShouldContainCrumbSepratorsFromColumnInCompareTable( String stepId, String count,
            String columnName )
        throws Throwable
    {
        //Start block
        GlobalHdrStepDef.mLog.trace(
                "Starting of StepDef public TheBreadcrumbShouldContainCrumbSepratorsFromColumnInCompareTable( String stepId, String count,String columnName )throws Throwable" );
        Util.logStepDefStart( GlobalHdrStepDef.mLog, stepId );
        GlobalHdrStepDef.mLog.info( stepId + " The Breadcrumb should contain " + count + " from " + columnName
                + " column of compare table" );
        int err = 0;

        GlobalVariable glbVar = GlobalVariable.getInstance();
        //Added for variable support
        count = count.contains( "$(" ) ? glbVar.getVariableValue( count ) : count;
        columnName = columnName.contains( "$(" ) ? glbVar.getVariableValue( columnName ) : columnName;

        //Implementation block
        try
        {
            GlobalHeader glbHeaderPg = GlobalHeader.getInstance();
            err = glbHeaderPg.verifyBreadcrumbSeparatorsForColumnInCompareTable( count, columnName );
        }
        catch( Exception ex )
        {
            GlobalHdrStepDef.mLog.error( Util.getCompleteStackTraceInfo( ex ) );
            err = ErrorCodes.FAILED_WITH_EXCEPTION;
        }

        //end block
        Util.logStepDefEnd( GlobalHdrStepDef.mLog, stepId, err );
    }

    /**
     * This stepdef will verify the given value is present in the breadcrumb of the left compare table. It is assumed
     * that two items are opened in compare mode to verify the value in breadcrumb.
     *
     * @param stepId Id of the step
     * @param value Value to be verified in breadcrumb
     * @throws Throwable Throws exception in case of any error
     */
    @Then( "^\"([^\"]*)\" The breadcrumb should contain value \"([^\"]*)\" from left compare table$" )
    public void theBreadcrumbShouldContainValueFromLeftComparetable( String stepId, String value )
        throws Throwable
    {
        //Start block
        GlobalHdrStepDef.mLog.trace(
                "Starting of StepDef public theBreadcrumbShouldContainValueFromLeftComparetable( String stepId, String value )throws Throwable" );
        Util.logStepDefStart( GlobalHdrStepDef.mLog, stepId );
        GlobalHdrStepDef.mLog.info(
                stepId + " The breadcrumb should contain value  " + value + " from left compare table" );
        int err = 0;

        GlobalVariable glbVar = GlobalVariable.getInstance();
        //Added for variable support
        value = value.contains( "$(" ) ? glbVar.getVariableValue( value ) : value;

        //Implementation block
        try
        {
            GlobalHeader glbHeaderPg = GlobalHeader.getInstance();
            err = glbHeaderPg.verifyValueInBreadcrumbForLeftCompareTable( value );
        }
        catch( Exception ex )
        {
            GlobalHdrStepDef.mLog.error( Util.getCompleteStackTraceInfo( ex ) );
            err = ErrorCodes.FAILED_WITH_EXCEPTION;
        }

        //end block
        Util.logStepDefEnd( GlobalHdrStepDef.mLog, stepId, err );
    }

    /**
     * This stepdef will verify the given value is present in the breadcrumb of the right compare table. It is assumed
     * that two items are opened in compare mode to verify the value in breadcrumb.
     *
     * @param stepId Id of the step
     * @param value Value to be verified in breadcrumb
     * @throws Throwable Throws exception in case of any error
     */
    @Then( "^\"([^\"]*)\" The breadcrumb should contain value \"([^\"]*)\" from right compare table$" )
    public void theBreadcrumbShouldContainValueFromRightComparetable( String stepId, String value )
        throws Throwable
    {
        //Start block
        GlobalHdrStepDef.mLog.trace(
                "Starting of StepDef public theBreadcrumbShouldContainValueFromRightComparetable( String stepId, String value )throws Throwable" );
        Util.logStepDefStart( GlobalHdrStepDef.mLog, stepId );
        GlobalHdrStepDef.mLog.info(
                stepId + " The breadcrumb should contain value  " + value + " from right compare table" );
        int err = 0;

        GlobalVariable glbVar = GlobalVariable.getInstance();
        //Added for variable support
        value = value.contains( "$(" ) ? glbVar.getVariableValue( value ) : value;

        //Implementation block
        try
        {
            GlobalHeader glbHeaderPg = GlobalHeader.getInstance();
            err = glbHeaderPg.verifyValueInBreadcrumbForRightCompareTable( value );
        }
        catch( Exception ex )
        {
            GlobalHdrStepDef.mLog.error( Util.getCompleteStackTraceInfo( ex ) );
            err = ErrorCodes.FAILED_WITH_EXCEPTION;
        }

        //end block
        Util.logStepDefEnd( GlobalHdrStepDef.mLog, stepId, err );
    }

    /**
     * This step def is used to validate Global Search Box [is/is not] visible on page.
     *
     * @param stepId Id of step
     * @param mode It can be [is/is not]
     * @throws Throwable throws exception in case of any error
     * @author Roshani.katre
     */
    @Then( "^\"([^\"]*)\" Validate global search box \"([^\"]*)\" visible$" )
    public void validate_global_search_box_visible( String stepId, String mode )
        throws Throwable
    {
        //Start block
        GlobalHdrStepDef.mLog.trace(
                "Start of public void validate_global_search_box_visible( String stepId , String mode )" );
        Util.logStepDefStart( GlobalHdrStepDef.mLog, stepId );
        GlobalHdrStepDef.mLog.info( stepId + " Validate global search box " + mode + " visible" );
        int err = 0;
        boolean flag = false;

        //Implementation block
        try
        {
            GlobalHeader glbHeaderPg = GlobalHeader.getInstance();
            flag = glbHeaderPg.validateGlobalSearchBoxVisible();

            if( mode.equalsIgnoreCase( "is" ) && flag )
            {
                GlobalHdrStepDef.mLog.info( "Verification successfully." );
            }
            else if( mode.equalsIgnoreCase( "is not" ) && !flag )
            {
                GlobalHdrStepDef.mLog.info( "Verification successfully." );
            }
            else
            {
                GlobalHdrStepDef.mLog.info( "Failed: Verification failed" );
                err = ErrorCodes.FAILED_WITH_EXCEPTION;
            }
        }
        catch( Exception ex )
        {
            GlobalHdrStepDef.mLog.error( Util.getCompleteStackTraceInfo( ex ) );
            err = ErrorCodes.FAILED_WITH_EXCEPTION;
        }

        //end block
        Util.logStepDefEnd( GlobalHdrStepDef.mLog, stepId, err );
    }

    /**
     * @param stepId ID of the test step
     * @param inputCountStr Count by which search result count should be greater
     * @throws Throwable Exception in case of error
     * @unpublished
     */
    @Then( "^\"([^\"]*)\" Validate that more than \"([^\"]*)\" search results are found$" )
    public void validate_that_more_than_search_results_are_found( String stepId, String inputCountStr )
        throws Throwable
    {
        //Start block
        GlobalHdrStepDef.mLog.trace(
                "public void i_validate_that_more_than_search_results_are_found( String stepId, String expectedCount )" );
        Util.logStepDefStart( GlobalHdrStepDef.mLog, stepId );
        GlobalHdrStepDef.mLog.info(
                stepId + " I validate that more than " + inputCountStr + " search results are found" );
        int err = 0;

        GlobalVariable glbVar = GlobalVariable.getInstance();
        //Added for variable support
        inputCountStr = inputCountStr.contains( "$(" ) ? glbVar.getVariableValue( inputCountStr ) : inputCountStr;

        try
        {
            //Implementation block
            //Ensure that progress bar has gone
            GlobalHeader glbHeader = GlobalHeader.getInstance();
            err = glbHeader.isProgressBarGone();

            //get the count from the bread crumb of global search result page
            int actualCount = glbHeader.getGlbSrchRsltCount();

            //compare actual count and the input count
            int inputCount = Integer.parseInt( inputCountStr );
            if( actualCount > inputCount )
            {
                err = 0;
            }
            else
            {
                GlobalHdrStepDef.mLog.error( "Actual Result count(" + Integer.toString( inputCount )
                        + ") is NOT more than the expected count(Str:'" + inputCountStr + "', Integer:"
                        + Integer.toString( inputCount ) + ")" );
                err = ErrorCodes.GLB_SRCH_RESULT_COUNT_NOT_AS_EXPECTED;
            }
        }
        catch( Exception ex )
        {
            GlobalHdrStepDef.mLog.error( Util.getCompleteStackTraceInfo( ex ) );
            err = ErrorCodes.FAILED_WITH_EXCEPTION;
        }

        //end block
        Util.logStepDefEnd( GlobalHdrStepDef.mLog, stepId, err );
    }

    /**
     * This step definition will verify that on global header, given value follow a particular format or not
     *
     * @param stepId stepId ID of this step
     * @param strType The string condition for comparison like - starts with, contains, ends with
     * @param propVal The property value sub-string for comparison
     * @throws Throwable Exception in case of error
     * @unpublished
     */
    @Then( "^\"([^\"]*)\" Validate that page heading \"([^\"]*)\" \"([^\"]*)\"$" )
    public void validate_that_page_heading( String stepId, String strType, String propVal )
        throws Throwable
    {
        //Start block
        GlobalHdrStepDef.mLog.trace(
                "Starting of StepDef public void validate_that_page_heading( String stepId, String propVal )" );
        Util.logStepDefStart( GlobalHdrStepDef.mLog, stepId );
        GlobalHdrStepDef.mLog.info( stepId + " Validate that page heading " + strType + " " + propVal );
        int err = 0;
        String headValue = null;

        GlobalVariable glbVar = GlobalVariable.getInstance();
        //Added for variable support
        strType = strType.contains( "$(" ) ? glbVar.getVariableValue( strType ) : strType;
        propVal = propVal.contains( "$(" ) ? glbVar.getVariableValue( propVal ) : propVal;

        try
        {
            //Implementation block
            GlobalHeader glbHeaderPg = GlobalHeader.getInstance();
            headValue = glbHeaderPg.getLocationTitle();

            switch( strType )
            {
            case "contains":
                if( headValue.contains( propVal ) )
                {

                    GlobalHdrStepDef.mLog.info( "Page Heading " + strType + " " + propVal );
                }
                break;

            case "is":
                if( headValue.equalsIgnoreCase( propVal ) )
                {

                    GlobalHdrStepDef.mLog.info( "Page Heading " + strType + " " + propVal );
                }
                break;

            case "starts with":
                if( headValue.startsWith( propVal ) )
                {

                    GlobalHdrStepDef.mLog.info( "Page Heading " + strType + " " + propVal );
                }
                break;

            case "ends with":
                if( headValue.endsWith( propVal ) )
                {

                    GlobalHdrStepDef.mLog.info( "Page Heading " + strType + " " + propVal );
                }
                break;

            default:
                GlobalHdrStepDef.mLog.info( "Page Heading " + strType + " Does not have" + propVal );
            }

        }
        catch( Exception ex )
        {
            GlobalHdrStepDef.mLog.error( Util.getCompleteStackTraceInfo( ex ) );
            err = ErrorCodes.FAILED_WITH_EXCEPTION;
        }

        //end block
        Util.logStepDefEnd( GlobalHdrStepDef.mLog, stepId, err );
    }

    /**
     * This step definition will verify that page with given heading is opened. This step has variable support.
     *
     * @param stepId stepId ID of this step
     * @param pgHeading Name of the page [provided in step] which will open.
     * @throws Throwable Throwable throws exception if any error
     * @unpublished
     */
    @Then( "^\"([^\"]*)\" Validate that page with heading \"([^\"]*)\" is opened$" )
    public void validate_that_page_with_heading_is_opened( String stepId, String pgHeading )
        throws Throwable
    {
        //Start block
        GlobalHdrStepDef.mLog.trace(
                "Starting of StepDef public void validate_that_page_with_heading_is_opened( String stepId, String pgHeading )" );
        Util.logStepDefStart( GlobalHdrStepDef.mLog, stepId );
        GlobalHdrStepDef.mLog.info( stepId + " Validate that page with heading " + pgHeading + " is opened" );
        int err = 0;

        GlobalVariable glbVar = GlobalVariable.getInstance();
        //Added for variable support
        pgHeading = pgHeading.contains( "$(" ) ? glbVar.getVariableValue( pgHeading ) : pgHeading;

        try
        {
            //Implementation block
            GlobalHeader glbHeaderPg = GlobalHeader.getInstance();
            err = glbHeaderPg.verifyPage( pgHeading );
        }
        catch( Exception ex )
        {
            GlobalHdrStepDef.mLog.error( Util.getCompleteStackTraceInfo( ex ) );
            err = ErrorCodes.FAILED_WITH_EXCEPTION;
        }

        //end block
        Util.logStepDefEnd( GlobalHdrStepDef.mLog, stepId, err );
    }

    /**
     * This step will verify the globar header Name of selected item present.
     *
     * @author vaidehi-sonawane
     * @param stepId ID of the test step
     * @param ItemName Name of the item
     * @param Revision Revision of the item
     * @param condition incremented/updated
     * @param Id Id of the item
     * @throws Throwable Exception in case of error
     */

    @Then( "^\"([^\"]*)\" Globalheader should contain element with name \"([^\"]*)\" revision \"([^\"]*)\" and \"([^\"]*)\" id for \"([^\"]*)\" after save as and replace$" )
    public void validate_the_globalheader_should_contain_incremented_value_after_SaveAndReplace( String stepId,
            String ItemName, String Revision, String condition, String Id )
        throws Throwable
    {
        GlobalHdrStepDef.mLog.trace(
                "Start Of validate_the_globalheader_should_contain_incremented_value_after_SaveAndReplace(String stepId, String ItemName, String Revision,String Id)" );
        Util.logStepDefStart( GlobalHdrStepDef.mLog, stepId );
        GlobalHdrStepDef.mLog.info( stepId + " Globalheader should contain element with name " + ItemName + " revision "
                + Revision + " and " + condition + " id for " + Id + " after save as and replace" );
        GlobalVariable glbVar = GlobalVariable.getInstance();
        int err = 0;
        String[] glbContents = new String[2];
        ItemName = ItemName.contains( "$(" ) ? glbVar.getVariableValue( ItemName ) : ItemName;
        Revision = Revision.contains( "$(" ) ? glbVar.getVariableValue( Revision ) : Revision;
        Id = Id.contains( "$(" ) ? glbVar.getVariableValue( Id ) : Id;
        if( condition.equalsIgnoreCase( "incremented" ) )
        {
            int incrementedId = Integer.parseInt( Id );
            incrementedId = incrementedId + 1;
            Id = String.valueOf( incrementedId );
        }
        glbContents[0] = Id;
        glbContents[1] = Revision;
        GlobalHdrStepDef.mLog.info( "Id to be validated is  : " + glbContents[0] );
        GlobalHdrStepDef.mLog.info( "Revision to be validated is  : " + glbContents[1] );
        try
        {
            //Implementation block
            GlobalHeader glbHeaderPg = GlobalHeader.getInstance();
            boolean result = glbHeaderPg.verifyGlobalHeaderContains( glbContents );
            if( condition.equalsIgnoreCase( "updated" ) )
            {
                if( !result )
                {
                    GlobalHdrStepDef.mLog.info( " Globalheader contains element with" + condition + " id for "
                            + glbContents + " after save as and replace" );
                }
                else
                {
                    GlobalHdrStepDef.mLog.info( " Globalheader does not contains element with" + condition + " id for "
                            + glbContents + " after save as and replace" );
                    err = ErrorCodes.VERIFY_FAILED;
                }
            }
            if( condition.equalsIgnoreCase( "incremented" ) )
            {
                if( result )
                {
                    GlobalHdrStepDef.mLog.info( " Globalheader contains element with" + condition + " id for "
                            + glbContents + " after save as and replace" );
                }
                else
                {
                    GlobalHdrStepDef.mLog.info( " Globalheader does not contains element with" + condition + " id for "
                            + glbContents + " after save as and replace" );
                    err = ErrorCodes.VERIFY_FAILED;
                }
            }

        }
        catch( Exception ex )
        {
            GlobalHdrStepDef.mLog.error( Util.getCompleteStackTraceInfo( ex ) );
            err = ErrorCodes.FAILED_WITH_EXCEPTION;
        }

        //end block
        Util.logStepDefEnd( GlobalHdrStepDef.mLog, stepId, err );
    }

    /**
     * This step definition will Verify breadcrumb should contain Product name
     *
     * @param stepId ID of the test step
     * @param ItemNm Name of the item to be verified
     * @throws Throwable Exception in case of error
     */
    @Then( "^\"([^\"]*)\" Verify breadcrumb should contain product name \"([^\"]*)\"$" )
    public void verify_breadcrumb_should_contain_product_name( String stepId, String ItemNm )
        throws Throwable
    {
        //Start block
        GlobalHdrStepDef.mLog.trace(
                "Starting of StepDef verify_breadcrumb_should_contain_product_name( String stepId, String ItNm )" );
        Util.logStepDefStart( GlobalHdrStepDef.mLog, stepId );
        GlobalHdrStepDef.mLog.info( stepId + "Verify breadcrumb should contain product name" + ItemNm );
        int err = 0;

        GlobalVariable glbVar = GlobalVariable.getInstance();
        //Added for variable support
        ItemNm = ItemNm.contains( "$(" ) ? glbVar.getVariableValue( ItemNm ) : ItemNm;

        //Implementation block
        try
        {
            GlobalHeader glbHeaderPg = GlobalHeader.getInstance();
            err = glbHeaderPg.verifyProductName( ItemNm );
        }
        catch( Exception ex )
        {
            GlobalHdrStepDef.mLog.error( Util.getCompleteStackTraceInfo( ex ) );
            err = ErrorCodes.FAILED_WITH_EXCEPTION;
        }

        //end block
        Util.logStepDefEnd( GlobalHdrStepDef.mLog, stepId, err );
    }

    /**
     * This step def is used to validate value of provide category on Global header. Assume that category is display for
     * validate value. ex. On filter panel, select type as Change Notice Revision, then this step validate Change Notice
     * Revision value for category Type on Global header.
     *
     * @param stepId Id of step
     * @param catNm Category name
     * @param value Value to validate
     * @throws Throwable Throws exception in case of any error
     * @author Roshani.katre
     */
    @Then( "^\"([^\"]*)\" Validate \"([^\"]*)\" breadcrumb should display value \"([^\"]*)\"$" )
    public void verify_breadcrumb_should_display_value( String stepId, String catNm, String value )
        throws Throwable
    {
        //Start block
        GlobalHdrStepDef.mLog.trace(
                "Starting of StepDef public void verify_breadcrumb_should_display_value( String stepId, String catNm, String value)" );
        Util.logStepDefStart( GlobalHdrStepDef.mLog, stepId );
        GlobalHdrStepDef.mLog.info( stepId + "Validate" + catNm + " breadcrumb should display value " + value );
        int err = 0;

        GlobalVariable glbVar = GlobalVariable.getInstance();
        //Added for variable support
        catNm = catNm.contains( "$(" ) ? glbVar.getVariableValue( catNm ) : catNm;

        //Implementation block
        try
        {
            GlobalHeader glbHeaderPg = GlobalHeader.getInstance();
            err = glbHeaderPg.validateBreadcrumbDisplayValue( catNm, value );
        }
        catch( Exception ex )
        {
            GlobalHdrStepDef.mLog.error( Util.getCompleteStackTraceInfo( ex ) );
            err = ErrorCodes.FAILED_WITH_EXCEPTION;
        }

        //end block
        Util.logStepDefEnd( GlobalHdrStepDef.mLog, stepId, err );
    }

    /**
     * This step will click on the category link in the global header and then verify if the given category is present
     * in the category list. It is assumed that the category link is present and visible in the global header.
     *
     * @param stepId ID of the test step
     * @param catName Name of the category
     * @throws Throwable Exception in case of error
     * @unpublished
     */
    @Then( "^\"([^\"]*)\" Verify that \"([^\"]*)\" is present in the search category list$" )
    public void verify_that_is_present_in_the_search_category_link( String stepId, String catName )
        throws Throwable
    {
        //Start block
        GlobalHdrStepDef.mLog.trace(
                "Starting of StepDef public void verify_that_is_present_in_the_search_category_list( String stepId, String catName )" );
        Util.logStepDefStart( GlobalHdrStepDef.mLog, stepId );
        GlobalHdrStepDef.mLog.info( stepId + " Verify that " + catName + " is present in the search category list" );
        int err = 0;

        try
        {
            //Implementation block
            GlobalHeader glbHeaderPg = GlobalHeader.getInstance();
            glbHeaderPg.clickOnCategoryLink();
            boolean flag = glbHeaderPg.verifyCategoryItem( catName );
            glbHeaderPg.clickOnCategoryLink();

            if( flag == true )
            {
                GlobalHdrStepDef.mLog.info( "The Category " + catName + " is present in the list" );
            }
            else
            {
                GlobalHdrStepDef.mLog.info( "The Category " + catName + " is not present in the list" );
            }
        }
        catch( Exception ex )
        {
            GlobalHdrStepDef.mLog.error( Util.getCompleteStackTraceInfo( ex ) );
            err = ErrorCodes.FAILED_WITH_EXCEPTION;
        }

        //end block
        Util.logStepDefEnd( GlobalHdrStepDef.mLog, stepId, err );

    }

    /**
     * This step will click on the category link in the global search and verify if the category list has the given
     * number of categories present in its list. It is assumed that the category link is present and visible on the
     * global header.
     *
     * @param stepId ID of the test step
     * @param catNum Number of categories
     * @throws Throwable Exception in case of error
     * @unpublished
     */
    @Then( "^\"([^\"]*)\" Verify that there are \"([^\"]*)\" search category links$" )
    public void verify_that_there_are_search_category_links( String stepId, int catNum )
        throws Throwable
    {
        //Start block
        GlobalHdrStepDef.mLog.trace(
                "Starting of StepDef public void verify_that_there_are_search_category_links( String stepId, int catNum )" );
        Util.logStepDefStart( GlobalHdrStepDef.mLog, stepId );
        GlobalHdrStepDef.mLog.info( stepId + " Verify that there are " + catNum + " search category links" );
        int err = 0;

        try
        {
            //Implementation block
            GlobalHeader glbHeaderPg = GlobalHeader.getInstance();
            glbHeaderPg.clickOnCategoryLink();
            boolean flag = glbHeaderPg.verifyCategoryList( catNum );
            glbHeaderPg.clickOnCategoryLink();

            if( flag == true )
            {
                GlobalHdrStepDef.mLog.info( "The Category Link has " + catNum + " number of items in the list" );
            }
            else
            {
                GlobalHdrStepDef.mLog.info(
                        "The Category Link does not have " + catNum + " number of items in the list" );
            }
        }
        catch( Exception ex )
        {
            GlobalHdrStepDef.mLog.error( Util.getCompleteStackTraceInfo( ex ) );
            err = ErrorCodes.FAILED_WITH_EXCEPTION;
        }

        //end block
        Util.logStepDefEnd( GlobalHdrStepDef.mLog, stepId, err );
    }

    /**
     * This step definition will Verify number of separators between BreadCrumb chevron
     *
     * @param stepId ID of the test step
     * @param separators -Entered number of separators to be Verified
     * @throws Throwable Exception in case of error
     */

    @Then( "^\"([^\"]*)\" Verify the breadcrumb should contain \"([^\"]*)\" crumb seperators$" )
    public void verify_the_breadcrumb_should_contain_crumb_seperators( String stepId, String separators )
        throws Throwable
    {
        //Start block
        GlobalHdrStepDef.mLog.trace(
                "Starting of StepDef public verify_the_breadcrumb_should_contain_crumb_seperators( String stepId, String separators )" );
        Util.logStepDefStart( GlobalHdrStepDef.mLog, stepId );
        GlobalHdrStepDef.mLog.info(
                stepId + "Verify the breadcrumb should contain" + separators + " crumb seperators/chevron" );
        int err = 0;

        GlobalVariable glbVar = GlobalVariable.getInstance();
        //Added for variable support
        separators = separators.contains( "$(" ) ? glbVar.getVariableValue( separators ) : separators;

        //Implementation block
        try
        {
            GlobalHeader glbHeaderPg = GlobalHeader.getInstance();
            err = glbHeaderPg.verifyCrumbSeperators( separators );
        }
        catch( Exception ex )
        {
            GlobalHdrStepDef.mLog.error( Util.getCompleteStackTraceInfo( ex ) );
            err = ErrorCodes.FAILED_WITH_EXCEPTION;
        }
        //end block
        Util.logStepDefEnd( GlobalHdrStepDef.mLog, stepId, err );
    }

    /**
     * This Step is used to Validate visual status indicator icon title on Header of Object.
     *
     * @param stepId Id of Step
     * @param title title name that validate on icon
     * @throws Throwable Throws exception in case of any error
     * @author Roshani.katre
     * @unpublished
     */
    @And( "^\"([^\"]*)\" visual status indicator title on header should contains \"([^\"]*)\"$" )
    public void visual_status_indicator_title_on_header_contain( String stepId, String title )
        throws Throwable
    {
        //Start block
        GlobalHdrStepDef.mLog.trace(
                "Start of public void visual_status_indicator_title_on_header_contain( String stepId , String title )" );
        Util.logStepDefStart( GlobalHdrStepDef.mLog, stepId );
        GlobalHdrStepDef.mLog.info( stepId + " visual status indicator title on header should contains " + title );
        int err = 0;
        boolean flag = false;

        //Implementation block
        try
        {
            GlobalHeader glbHeaderPg = GlobalHeader.getInstance();
            flag = glbHeaderPg.visualStatusIndicatorTitleOnHeader( title );

            if( flag )
            {
                GlobalHdrStepDef.mLog.info( "Success: Verification successful" );
            }
            else
            {
                GlobalHdrStepDef.mLog.info( "Failed: Verification failed" );
                err = ErrorCodes.FAILED_WITH_EXCEPTION;
            }
        }
        catch( Exception ex )
        {
            GlobalHdrStepDef.mLog.error( Util.getCompleteStackTraceInfo( ex ) );
            err = ErrorCodes.FAILED_WITH_EXCEPTION;
        }

        //end block
        Util.logStepDefEnd( GlobalHdrStepDef.mLog, stepId, err );
    }

    /**
     * This Step is used to Validate visual status indicator icon on Header of Object. e.g When item is attach to a
     * change object then on header of item shows with triangle shape icon with Authoring Change title or it can be TCM
     * released icon also.
     *
     * @param stepId Id of Step
     * @throws Throwable Throws exception in case of any error
     * @author Roshani.katre
     * @unpublished
     */
    @Then( "^\"([^\"]*)\" visual status indicator should be visible on header$" )
    public void visual_status_indicator_visible_on_header( String stepId )
        throws Throwable
    {
        //Start block
        GlobalHdrStepDef.mLog.trace(
                "Start of public void visual_status_indicator_visible_on_header( String stepId )" );
        Util.logStepDefStart( GlobalHdrStepDef.mLog, stepId );
        GlobalHdrStepDef.mLog.info( stepId + " visual status indicator should be visible on header " );
        int err = 0;
        boolean flag = false;

        //Implementation block
        try
        {
            GlobalHeader glbHeaderPg = GlobalHeader.getInstance();
            flag = glbHeaderPg.visualStatusIndicatorVisibleOnHeader();

            if( flag )
            {
                GlobalHdrStepDef.mLog.info( "Success: Verification successful" );
            }
            else
            {
                GlobalHdrStepDef.mLog.info( "Failed: Verification failed" );
                err = ErrorCodes.FAILED_WITH_EXCEPTION;
            }
        }
        catch( Exception ex )
        {
            GlobalHdrStepDef.mLog.error( Util.getCompleteStackTraceInfo( ex ) );
            err = ErrorCodes.FAILED_WITH_EXCEPTION;
        }

        //end block
        Util.logStepDefEnd( GlobalHdrStepDef.mLog, stepId, err );
    }

    /**
     * This step will wait until progress bar go. It is assumed that this stepdef used where there is progress bar
     * present.
     *
     * @param stepId ID of the test step
     * @throws Throwable Exception in case of error
     */
    @Then( "^\"([^\"]*)\" Wait for progress bar to go$" )
    public void waitForProgressBarToGo( String stepId )
        throws Throwable
    {
        //Start block
        GlobalHdrStepDef.mLog.trace( " public void waitForProgressBarToGo( String stepId )" );
        Util.logStepDefStart( GlobalHdrStepDef.mLog, stepId );
        GlobalHdrStepDef.mLog.info( stepId + " Wait for progress bar to go" );
        SeleniumUtil selUtil = SeleniumUtil.getInstance();
        int err = 0;
        long pBarTimeOut = selUtil.mTimeOutLow;
        int pBarRetry = selUtil.mMaxRetry;
        long hiddenPBarTimeOut = selUtil.mTimeOutHigh;
        int hiddenPBarRetry = selUtil.mMaxRetry;

        try
        {
            //Ensure that progress bar has gone
            GlobalHeader glbHeader = GlobalHeader.getInstance();
            err = glbHeader.isProgressBarGone( pBarTimeOut, pBarRetry, hiddenPBarTimeOut, hiddenPBarRetry );
        }
        catch( Exception ex )
        {
            GlobalHdrStepDef.mLog.error( Util.getCompleteStackTraceInfo( ex ) );
            err = ErrorCodes.FAILED_WITH_EXCEPTION;
        }

        //end block
        Util.logStepDefEnd( GlobalHdrStepDef.mLog, stepId, err );
    }

}
