/**
 * Copyright 2019 HCL Technologies Limited. All Rights Reserved.
 */

package stepdefs.core;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.log4j.Logger;
import pages.core.GlobalHeader;
import pages.core.GlobalNavigation;
import util.Constants;
import util.ErrorCodes;
import util.GlobalVariable;
import util.Util;

/**
 * This class has definition for all the steps related to the GlobalNavigation
 */
public class GlobalNavigationStepDef
{
    /**
     * Logger for this class
     */
    static Logger mLog = Logger.getLogger( GlobalNavigationStepDef.class );

    /**
     * Constructor
     *
     * @unpublished
     */
    public GlobalNavigationStepDef()
    {
        super();
        GlobalNavigationStepDef.mLog.trace( "Start of GlobalNavigationStepDef()" );
    }

    /**
     * Step definition to add Item ID in the given file, so it can be delete by datamanagement tool
     *
     * @param stepId stepId stepId ID of this step
     * @param Id Id of Item
     * @throws Throwable Throwable throws exception if any error
     * @unpublished
     */
    @Then( "^\"([^\"]*)\" Add ID \"([^\"]*)\" in file for deleting object$" )
    public void add_id_in_file_for_deleting_object( String stepId, String Id )
        throws Throwable
    {
        //Start block
        GlobalNavigationStepDef.mLog.trace(
                "Starting of StepDef store_id_in_file_for_deleting_object( String stepId, String Id)" );
        Util.logStepDefStart( GlobalNavigationStepDef.mLog, stepId );
        GlobalNavigationStepDef.mLog.info( stepId + " Store ID " + Id + " in file for deleting object" );
        int err = 0;

        //Added for variable support
        GlobalVariable glbVar = GlobalVariable.getInstance();
        Id = Id.contains( "$(" ) ? glbVar.getVariableValue( Id ) : Id;

        try
        {
            //Implementation block
            GlobalNavigation glbNavToolbar = GlobalNavigation.getInstance();
            glbNavToolbar.addIDToFile( Id );
        }
        catch( Exception ex )
        {
            GlobalNavigationStepDef.mLog.error( Util.getCompleteStackTraceInfo( ex ) );
            err = ErrorCodes.FAILED_WITH_EXCEPTION;
        }

        //end block
        Util.logStepDefEnd( GlobalNavigationStepDef.mLog, stepId, err );
    }

    /**
     * Step to execute the global navigation toolbar command. This step has variable support.
     *
     * @param stepId ID of the test step
     * @param cmdTitle actual command on the global navigation toolbar, which is to be clicked
     * @throws Throwable Exception in case of error
     * @unpublished
     */
    @Then( "^\"([^\"]*)\" Click on \"([^\"]*)\" command in the Global Navigation Bar$" )
    public void click_on_command_in_the_globar_navigation_bar( String stepId, String cmdTitle )
        throws Throwable
    {
        //Start block
        GlobalNavigationStepDef.mLog.trace(
                "Start of public void click_on_command_in_the_globar_navigation_bar( String stepId, String cmdTitle )" );
        Util.logStepDefStart( GlobalNavigationStepDef.mLog, stepId );
        GlobalNavigationStepDef.mLog.info( stepId + " Click on " + cmdTitle + " command in the Global Navigation Bar" );
        int err = 0;

        GlobalVariable glbVar = GlobalVariable.getInstance();
        //Added for variable support
        cmdTitle = cmdTitle.contains( "$(" ) ? glbVar.getVariableValue( cmdTitle ) : cmdTitle;

        try
        {
            //Implementation block
            //instantiate object of GlobalToolbar class
            GlobalNavigation glbNavToolbar = GlobalNavigation.getInstance();

            //find the object
            glbNavToolbar.clickOnGlbNavCmd( cmdTitle );

            //wait for the progress bar to hide
            GlobalHeader glbHeader = GlobalHeader.getInstance();
            glbHeader.isProgressBarGone();

        }
        catch( Exception ex )
        {
            GlobalNavigationStepDef.mLog.error( Util.getCompleteStackTraceInfo( ex ) );
            err = ErrorCodes.FAILED_WITH_EXCEPTION;
        }

        //end block
        Util.logStepDefEnd( GlobalNavigationStepDef.mLog, stepId, err );
    }

    /**
     * This stpedef is used to click on the command in global navigation bar given its location like 1st, 2nd and so on.
     *
     * @param stepId Id of the step
     * @param cmdLocation Location of the command in the global navigation bar
     * @throws Throwable Throws exception in case of any error
     */
    @Then( "^\"([^\"]*)\" Click on command on \"([^\"]*)\" location in the Global Navigation Bar$" )
    public void click_on_command_on_location_in_the_global_navigation_bar( String stepId, String cmdLocation )
        throws Throwable
    {
        //Start block
        GlobalNavigationStepDef.mLog.trace(
                "Start of  public void click_on_command_on_location_in_the_global_navigation_bar( String stepId, String cmdLocation )" );
        Util.logStepDefStart( GlobalNavigationStepDef.mLog, stepId );
        GlobalNavigationStepDef.mLog.info(
                stepId + " Click on " + cmdLocation + " command in the Global Navigation Bar" );
        int err = 0;

        try
        {
            //Implementation block

            //convert cmdIndex string to an integer
            String index = cmdLocation.substring( 0, cmdLocation.length() - 2 );
            int ind = Integer.parseInt( index );

            //instantiate object of GlobalToolbar class
            GlobalNavigation glbNavToolbar = GlobalNavigation.getInstance();

            //find the object
            glbNavToolbar.clickOnGlbNavCmdOnLocation( ind );

            //wait for the progress bar to hide
            GlobalHeader glbHeader = GlobalHeader.getInstance();
            glbHeader.isProgressBarGone();

        }
        catch( Exception ex )
        {
            GlobalNavigationStepDef.mLog.error( Util.getCompleteStackTraceInfo( ex ) );
            err = ErrorCodes.FAILED_WITH_EXCEPTION;
        }

        //end block
        Util.logStepDefEnd( GlobalNavigationStepDef.mLog, stepId, err );
    }

    /**
     * This method is used to Pin or Unpin user panel
     *
     * @param stepId Id of step
     * @param optName It should be[Pin/Unpin]
     * @throws Throwable throws exception in case of any error
     * @author Roshani.katre
     */
    @Then( "^\"([^\"]*)\" \"([^\"]*)\" user panel$" )
    public void click_pin_or_unpin_user_panel( String stepId, String optName )
        throws Throwable
    {
        //Start block
        GlobalNavigationStepDef.mLog.trace(
                "Starting of StepDef public void click_pin_or_unpin_user_panel( String stepId, String optName )" );
        Util.logStepDefStart( GlobalNavigationStepDef.mLog, stepId );
        GlobalNavigationStepDef.mLog.info( stepId + " " + optName + " user panel" );
        int err = 0;

        try
        {
            //Implementation block
            GlobalNavigation glbNavToolbar = GlobalNavigation.getInstance();
            glbNavToolbar.pinUnpinOnUserPanel( optName );
        }
        catch( Exception ex )
        {
            GlobalNavigationStepDef.mLog.error( Util.getCompleteStackTraceInfo( ex ) );
            err = ErrorCodes.FAILED_WITH_EXCEPTION;
        }

        //end block
        Util.logStepDefEnd( GlobalNavigationStepDef.mLog, stepId, err );
    }

    /**
     * @param stepId ID of this step
     * @throws Throwable throws exception if there is any failure
     * @unpublished
     */
    @And( "^\"([^\"]*)\" Logout from Teamcenter AWC$" )
    public void logoutFromTeamcenterAwc( String stepId )
        throws Throwable
    {
        GlobalNavigationStepDef.mLog.trace( "public void i_logout( String stepId )" );
        //Start block
        Util.logStepDefStart( GlobalNavigationStepDef.mLog, stepId );
        GlobalNavigationStepDef.mLog.info( stepId + " i_logout" );
        int err = 0;

        try
        {
            //Implementation block
            GlobalNavigation glbNavToolbar = GlobalNavigation.getInstance();
            err = glbNavToolbar.logout();
        }
        catch( Exception ex )
        {
            GlobalNavigationStepDef.mLog.error( Util.getCompleteStackTraceInfo( ex ) );
            err = ErrorCodes.FAILED_WITH_EXCEPTION;
        }

        //end block
        Util.logStepDefEnd( GlobalNavigationStepDef.mLog, stepId, err );
    }

    /**
     * This stepd is used to logout from AWC. It also closes the browser and kills the driver instance.
     *
     * @param stepId If of the step
     * @throws Throwable Throws exception in case of any error
     */
    @And( "^\"([^\"]*)\" Logout from Teamcenter AWC and quit$" )
    public void logoutFromTeamcenterAwcandQuit( String stepId )
        throws Throwable
    {
        GlobalNavigationStepDef.mLog.trace( "public void logoutFromTeamcenterAwcandQuit( String stepId )" );
        //Start block
        Util.logStepDefStart( GlobalNavigationStepDef.mLog, stepId );
        GlobalNavigationStepDef.mLog.info( stepId + " i_logout" );
        int err = 0;

        try
        {
            //Implementation block
            GlobalNavigation glbNavToolbar = GlobalNavigation.getInstance();
            err = glbNavToolbar.logoutAndQuit();
        }
        catch( Exception ex )
        {
            GlobalNavigationStepDef.mLog.error( Util.getCompleteStackTraceInfo( ex ) );
            err = ErrorCodes.FAILED_WITH_EXCEPTION;
        }

        //end block
        Util.logStepDefEnd( GlobalNavigationStepDef.mLog, stepId, err );
    }

    /**
     * Step definition to select the user link on the global navigation toolbar.
     *
     * @param stepId stepId ID of this step
     * @throws Throwable Throwable throws exception if any error
     * @unpublished
     */
    @Given( "^\"([^\"]*)\" On the Global Navigation Toolbar, click on User Link$" )
    public void on_the_global_navigation_toolbar_click_on_user_link( String stepId )
        throws Throwable
    {
        //Start block
        GlobalNavigationStepDef.mLog.trace(
                "Starting of StepDef public void on_the_global_navigation_toolbar_click_on_user_link( String stepId, String linkName )" );
        Util.logStepDefStart( GlobalNavigationStepDef.mLog, stepId );
        GlobalNavigationStepDef.mLog.info( stepId + "On the Global header, click on User Link" );
        int err = 0;
        try
        {
            GlobalHeader glbHeader = GlobalHeader.getInstance();
            err = glbHeader.isProgressBarGoneRetryOnce();

            //Implementation block
            GlobalNavigation glbNavToolbar = GlobalNavigation.getInstance();
            err = glbNavToolbar.clickOnUserLink();

        }
        catch( Exception ex )
        {
            GlobalNavigationStepDef.mLog.error( Util.getCompleteStackTraceInfo( ex ) );
            err = ErrorCodes.FAILED_WITH_EXCEPTION;
        }

        //end block
        Util.logStepDefEnd( GlobalNavigationStepDef.mLog, stepId, err );
    }

    /**
     * This step will find the given option on the user panel and will click on it. This step has variable support.
     *
     * @param stepId ID of test step
     * @param optName Name of the command to be clicked.
     * @throws Throwable Exception in case of error
     * @unpublished
     */
    @Then( "^\"([^\"]*)\" On the User Panel, click on \"([^\"]*)\"$" )
    public void on_the_user_panel_click_on( String stepId, String optName )
        throws Throwable
    {
        //Start block
        GlobalNavigationStepDef.mLog.trace(
                "Starting of StepDef public void on_the_user_panel_click_on( String stepId, String optName )" );
        Util.logStepDefStart( GlobalNavigationStepDef.mLog, stepId );
        GlobalNavigationStepDef.mLog.info( stepId + " On the User Panel, click on " + optName );
        int err = 0;

        GlobalVariable glbVar = GlobalVariable.getInstance();
        //Added for variable support
        optName = optName.contains( "$(" ) ? glbVar.getVariableValue( optName ) : optName;

        try
        {
            //Implementation block
            GlobalNavigation glbNavToolbar = GlobalNavigation.getInstance();
            err = glbNavToolbar.clickOnUserPanelOption( optName );

//            //Ensure that progress bar has gone
//            GlobalHeader glbHeader = GlobalHeader.getInstance();
//            err = glbHeader.isProgressBarGone();
        }
        catch( Exception ex )
        {
            GlobalNavigationStepDef.mLog.error( Util.getCompleteStackTraceInfo( ex ) );
            err = ErrorCodes.FAILED_WITH_EXCEPTION;
        }

        //end block
        Util.logStepDefEnd( GlobalNavigationStepDef.mLog, stepId, err );
    }

    /**
     * This step click on the given link and select the given option. This step has variable support.
     *
     * @param stepId ID of test step
     * @param linkName Name of the link to be clicked
     * @param optName Name of the option to be selected
     * @throws Throwable Exception in case of error
     * @unpublished
     */
    @Then( "^\"([^\"]*)\" On the User Panel, click on \"([^\"]*)\" and select \"([^\"]*)\" option$" )
    public void on_the_user_panel_click_on_and_select_option( String stepId, String linkName, String optName )
        throws Throwable
    {
        //Start block
        GlobalNavigationStepDef.mLog.trace(
                "Starting of StepDef public void on_the_user_panel_click_on_and_select_option( String stepId, String linkName, String optName )" );
        Util.logStepDefStart( GlobalNavigationStepDef.mLog, stepId );
        GlobalNavigationStepDef.mLog.info(
                stepId + " On the User Panel, click on " + linkName + " and select " + optName + " option" );
        int err = 0;

        GlobalVariable glbVar = GlobalVariable.getInstance();
        //Added for variable support
        linkName = linkName.contains( "$(" ) ? glbVar.getVariableValue( linkName ) : linkName;
        optName = optName.contains( "$(" ) ? glbVar.getVariableValue( optName ) : optName;

        try
        {
            //Implementation block
            GlobalNavigation glbNavToolbar = GlobalNavigation.getInstance();
            glbNavToolbar.selectOptFromLink( linkName, optName );

            GlobalHeader glbHeader = GlobalHeader.getInstance();
            err = glbHeader.isProgressBarGoneRetryOnce();
        }
        catch( Exception ex )
        {
            GlobalNavigationStepDef.mLog.error( Util.getCompleteStackTraceInfo( ex ) );
            err = ErrorCodes.FAILED_WITH_EXCEPTION;
        }

        //end block
        Util.logStepDefEnd( GlobalNavigationStepDef.mLog, stepId, err );
    }

    /**
     * This step def is used to click on icon on user panel. Assume that user panel is visible.
     *
     * @param stepId Id of step
     * @param iconName Name of icon [Pop Out User Properties / Return User Properties]
     * @throws Throwable throws exception in case of any error
     * @author Roshani.katre
     */
    @Then( "^\"([^\"]*)\" On the User Panel, click on \"([^\"]*)\" icon$" )
    public void on_the_user_panel_click_on_icon( String stepId, String iconName )
        throws Throwable
    {
        //Start block
        GlobalNavigationStepDef.mLog.trace(
                "Starting of StepDef public void on_the_user_panel_click_on_icon( String stepId, String iconName )" );
        Util.logStepDefStart( GlobalNavigationStepDef.mLog, stepId );
        GlobalNavigationStepDef.mLog.info( stepId + " On the User Panel, click on " + iconName + " icon" );
        int err = 0;

        GlobalVariable glbVar = GlobalVariable.getInstance();
        //Added for variable support
        iconName = iconName.contains( "$(" ) ? glbVar.getVariableValue( iconName ) : iconName;

        try
        {
            //Implementation block
            GlobalNavigation glbNavToolbar = GlobalNavigation.getInstance();
            glbNavToolbar.clickOnUserPanelIcon( iconName );

        }
        catch( Exception ex )
        {
            GlobalNavigationStepDef.mLog.error( Util.getCompleteStackTraceInfo( ex ) );
            err = ErrorCodes.FAILED_WITH_EXCEPTION;
        }

        //end block
        Util.logStepDefEnd( GlobalNavigationStepDef.mLog, stepId, err );
    }

    /**
     * This step will find the given option on the user panel Footer and will click on it. This step has variable
     * support. Assume that Footer Panel is visible.
     *
     * @param stepId ID of step
     * @param optName Name of the command to be clicked.
     * @throws Throwable Exception in case of error
     * @author Roshani.katre
     */
    @And( "^\"([^\"]*)\" On the User Panel Footer, click on \"([^\"]*)\"$" )
    public void on_the_user_panel_footer_click_on( String stepId, String optName )
        throws Throwable
    {
        //Start block
        GlobalNavigationStepDef.mLog.trace(
                "Starting of StepDef public void on_the_user_panel_footer_click_on( String stepId, String optName )" );
        Util.logStepDefStart( GlobalNavigationStepDef.mLog, stepId );
        GlobalNavigationStepDef.mLog.info( stepId + " On the User Panel Footer, click on " + optName );
        int err = 0;

        GlobalVariable glbVar = GlobalVariable.getInstance();
        //Added for variable support
        optName = optName.contains( "$(" ) ? glbVar.getVariableValue( optName ) : optName;

        try
        {
            //Implementation block
            GlobalNavigation glbNavToolbar = GlobalNavigation.getInstance();
            err = glbNavToolbar.clickOnUserPanelFooterOption( optName );

        }
        catch( Exception ex )
        {
            GlobalNavigationStepDef.mLog.error( Util.getCompleteStackTraceInfo( ex ) );
            err = ErrorCodes.FAILED_WITH_EXCEPTION;
        }

        //end block
        Util.logStepDefEnd( GlobalNavigationStepDef.mLog, stepId, err );
    }

    /**
     * This step click on the given link and select the given option on Footer User Panel. This step has variable
     * support.
     *
     * @param stepId ID of test step
     * @param linkName Name of the link to be clicked
     * @param optName Name of the option to be selected
     * @throws Throwable Exception in case of error
     * @author Roshani.katre
     */
    @Then( "^\"([^\"]*)\" On the User Panel Footer, click on \"([^\"]*)\" and select \"([^\"]*)\" option$" )
    public void on_the_user_panel_footer_click_on_and_select_option( String stepId, String linkName, String optName )
        throws Throwable
    {
        //Start block
        GlobalNavigationStepDef.mLog.trace(
                "Starting of StepDef public void on_the_user_panel_footer_click_on_and_select_option( String stepId, String linkName, String optName )" );
        Util.logStepDefStart( GlobalNavigationStepDef.mLog, stepId );
        GlobalNavigationStepDef.mLog.info(
                stepId + " On the User Panel Footer, click on " + linkName + " and select " + optName + " option" );
        int err = 0;

        GlobalVariable glbVar = GlobalVariable.getInstance();
        //Added for variable support
        linkName = linkName.contains( "$(" ) ? glbVar.getVariableValue( linkName ) : linkName;
        optName = optName.contains( "$(" ) ? glbVar.getVariableValue( optName ) : optName;

        try
        {
            GlobalHeader glbHeader = GlobalHeader.getInstance();
            err = glbHeader.isProgressBarGone();

            //Implementation block
            GlobalNavigation glbNavToolbar = GlobalNavigation.getInstance();
            glbNavToolbar.selectOptFromLinkFooter( linkName, optName );

            //GlobalHeader glbHeader = GlobalHeader.getInstance();
            //err = glbHeader.isProgressBarGone();
        }
        catch( Exception ex )
        {
            GlobalNavigationStepDef.mLog.error( Util.getCompleteStackTraceInfo( ex ) );
            err = ErrorCodes.FAILED_WITH_EXCEPTION;
        }

        //end block
        Util.logStepDefEnd( GlobalNavigationStepDef.mLog, stepId, err );
    }

    /**
     * this step is used to verify the text on the link [Revision Rule Link/Group Link/ Role Link/Project Link/
     * Workspace Link] available on the Footer. This step has variable support. Assume that Footer User Panel is
     * visible.
     *
     * @param stepId ID of this step
     * @param value Expected value to compare with the actual value on link Revision Rule Link/Group Link/ Role
     *            Link/Project Link/ Workspace Link]
     * @param linkName Link on the global header. Valid values are 'Workspace Link', 'Group Link', 'Role Link' ,
     *            'Project Link' & 'Revision Rule Link'
     * @throws Throwable Throwable throws exception if any error
     * @author Roshani.katre
     */
    @Then( "^\"([^\"]*)\" On the User Panel Footer, validate that \"([^\"]*)\" is displayed for the \"([^\"]*)\"$" )
    public void on_the_user_panel_footer_validate_that_is_displayed_for_the( String stepId, String value,
            String linkName )
        throws Throwable
    {
        //Start block
        GlobalNavigationStepDef.mLog.trace(
                "Starting of StepDef of  public void on_the_user_panel_footer_validate_that_is_displayed_for_the( String stepId, String value, String linkname )" );
        Util.logStepDefStart( GlobalNavigationStepDef.mLog, stepId );
        GlobalNavigationStepDef.mLog.info(
                stepId + " On the User Panel Footer, validate that " + value + " is displayed for the " + linkName );
        int err = 0;

        GlobalVariable glbVar = GlobalVariable.getInstance();
        //Added for variable support
        value = value.contains( "$(" ) ? glbVar.getVariableValue( value ) : value;
        linkName = linkName.contains( "$(" ) ? glbVar.getVariableValue( linkName ) : linkName;

        try
        {
            // Ensure that progress bar has gone
            GlobalHeader glbHeader = GlobalHeader.getInstance();
            err = glbHeader.isProgressBarGoneRetryOnce();
            //Implementation block
            GlobalNavigation glbNavToolbar = GlobalNavigation.getInstance();
            err = glbNavToolbar.verifyLinkTextFooter( value, linkName );

        }
        catch( Exception ex )
        {
            GlobalNavigationStepDef.mLog.error( Util.getCompleteStackTraceInfo( ex ) );
            err = ErrorCodes.FAILED_WITH_EXCEPTION;
        }

        //end block
        Util.logStepDefEnd( GlobalNavigationStepDef.mLog, stepId, err );

    }

    /**
     * This Step is for reseting the group\Role\Project after clicking on user link
     *
     * @param stepId stepId ID of test step
     * @param grpName Name of group to be select
     * @throws Throwable Throwable Exception in case of error
     * @unpublished
     */
    @Then( "^\"([^\"]*)\" On the User Panel, from popup select on \"([^\"]*)\"$" )
    public void on_the_user_panel_from_popup_select_on( String stepId, String grpName )
        throws Throwable
    {
        //Start block
        GlobalNavigationStepDef.mLog.trace(
                "Starting of StepDef  public void on_the_user_panel_from_popup_select_on( String stepId, String grpName )" );
        Util.logStepDefStart( GlobalNavigationStepDef.mLog, stepId );
        GlobalNavigationStepDef.mLog.info( stepId + " On the User Panel, from popup select on " + grpName );
        int err = 0;

        GlobalVariable glbVar = GlobalVariable.getInstance();
        //Added for variable support
        grpName = grpName.contains( "$(" ) ? glbVar.getVariableValue( grpName ) : grpName;

        try
        {
            //Implementation block
            GlobalNavigation glbNavToolbar = GlobalNavigation.getInstance();
            err = glbNavToolbar.selectFromPopup( grpName );

            //Ensure that progress bar has gone
            GlobalHeader glbHeader = GlobalHeader.getInstance();
            err = glbHeader.isProgressBarGone();
        }
        catch( Exception ex )
        {
            GlobalNavigationStepDef.mLog.error( Util.getCompleteStackTraceInfo( ex ) );
            err = ErrorCodes.FAILED_WITH_EXCEPTION;
        }

        //end block
        Util.logStepDefEnd( GlobalNavigationStepDef.mLog, stepId, err );
    }

    /**
     * Step definition to verify the text on the link [User Link/Group Link Role Link] available on the Global header.
     * This step has variable support.
     *
     * @param stepId ID of this step
     * @param value Expected value to compare with the actual value on link [User Link/Group Link/Role Link]
     * @param linkName Link on the global header. Valid values are 'User Link', 'Group Link', 'Role Link' & 'Revision
     *            Rule Link'
     * @throws Throwable Throwable throws exception if any error
     * @unpublished
     */
    @Then( "^\"([^\"]*)\" On the User Panel, validate that \"([^\"]*)\" is displayed for the \"([^\"]*)\"$" )
    public void on_the_user_panel_validate_that_is_displayed_for_the( String stepId, String value, String linkName )
        throws Throwable
    {
        //Start block
        GlobalNavigationStepDef.mLog.trace(
                "Starting of StepDef of  public void on_the_user_panel_validate_that_is_displayed_for_the( String stepId, String value, String linkname )" );
        Util.logStepDefStart( GlobalNavigationStepDef.mLog, stepId );
        GlobalNavigationStepDef.mLog.info(
                stepId + " On the User Panel, validate that " + value + " is displayed for the " + linkName );
        int err = 0;

        GlobalVariable glbVar = GlobalVariable.getInstance();
        //Added for variable support
        value = value.contains( "$(" ) ? glbVar.getVariableValue( value ) : value;
        linkName = linkName.contains( "$(" ) ? glbVar.getVariableValue( linkName ) : linkName;

        try
        {
            // Ensure that progress bar has gone
            GlobalHeader glbHeader = GlobalHeader.getInstance();
            err = glbHeader.isProgressBarGoneRetryOnce();
            //Implementation block
            GlobalNavigation glbNavToolbar = GlobalNavigation.getInstance();
            err = glbNavToolbar.verifyLinkText( value, linkName );

            // Ensure that progress bar has gone
            //GlobalHeader glbHeader = GlobalHeader.getInstance();
            //err = glbHeader.isProgressBarGone();
        }
        catch( Exception ex )
        {
            GlobalNavigationStepDef.mLog.error( Util.getCompleteStackTraceInfo( ex ) );
            err = ErrorCodes.FAILED_WITH_EXCEPTION;
        }

        //end block
        Util.logStepDefEnd( GlobalNavigationStepDef.mLog, stepId, err );

    }

    /**
     * Step definition to verify the user name, after clicking on User Link
     *
     * @param stepId ID of this step
     * @param expectedusername expected value of user name
     * @throws Throwable Throwable throws exception if any error
     * @unpublished
     */
    @Then( "^\"([^\"]*)\" On the User Panel, validate username is \"([^\"]*)\"$" )
    public void on_the_user_panel_validate_username_is( String stepId, String expectedusername )
        throws Throwable
    {
        //Start block
        GlobalNavigationStepDef.mLog.trace(
                "Starting of StepDef of  public void on_the_user_panel_validate_username_is( String stepId, String expectedusername )" );
        Util.logStepDefStart( GlobalNavigationStepDef.mLog, stepId );
        GlobalNavigationStepDef.mLog.info( stepId + "  On the User Panel, validate username is " + expectedusername );
        int err = 0;

        GlobalVariable glbVar = GlobalVariable.getInstance();
        //Added for variable support
        expectedusername = expectedusername.contains( "$(" ) ? glbVar.getVariableValue( expectedusername )
                : expectedusername;

        try
        {
            //Implementation block
            GlobalNavigation glbNavToolbar = GlobalNavigation.getInstance();
            String actualUserName = glbNavToolbar.getUserInfo( Constants.USER_NAME );

            if( actualUserName == null )
            {
                GlobalNavigationStepDef.mLog.info( "Actual value of User Name:'" + actualUserName + "' is null" );
                actualUserName = "";
            }

            if( actualUserName.toLowerCase().contains( expectedusername ) )
            {
                GlobalNavigationStepDef.mLog.info( "Both Actual value and expected value of User Name found is:'"
                        + actualUserName + "', which are same." );
            }
            else
            {
                GlobalNavigationStepDef.mLog.info( "User name value found is: " + actualUserName );
                err = ErrorCodes.PROPERTY_VALUE_NOT_AS_EXPECTED;
            }
        }
        catch( Exception ex )
        {
            GlobalNavigationStepDef.mLog.error( Util.getCompleteStackTraceInfo( ex ) );
            err = ErrorCodes.FAILED_WITH_EXCEPTION;
        }

        //end block
        Util.logStepDefEnd( GlobalNavigationStepDef.mLog, stepId, err );

    }

    /**
     * This step def is used to validate given user provided link [is/is not] visible on user panel
     *
     * @param stepId Id of step
     * @param linkName Name of link to validate visibility
     * @param mode it should be [is/is not]
     * @throws Throwable throws exception in case of any error
     * @author Roshani.katre
     */
    @And( "^\"([^\"]*)\" On user panel, validate \"([^\"]*)\" link \"([^\"]*)\" visible$" )
    public void on_user_panel_validate_link_visible( String stepId, String linkName, String mode )
        throws Throwable
    {
        //Start block
        GlobalNavigationStepDef.mLog.trace(
                "Start of public void on_user_panel_validate_link_visible( String stepId, String linkName, String mode )" );
        Util.logStepDefStart( GlobalNavigationStepDef.mLog, stepId );
        GlobalNavigationStepDef.mLog.info(
                stepId + " On user panel, validate " + linkName + " link " + mode + " visible" );
        int err = 0;
        boolean flag = false;

        GlobalVariable glbVar = GlobalVariable.getInstance();
        //Added for variable support
        linkName = linkName.contains( "$(" ) ? glbVar.getVariableValue( linkName ) : linkName;

        try
        {
            // Ensure that progress bar has gone
            GlobalHeader glbHeader = GlobalHeader.getInstance();
            err = glbHeader.isProgressBarGoneRetryOnce();
            //Implementation block
            GlobalNavigation glbNavToolbar = GlobalNavigation.getInstance();
            flag = glbNavToolbar.validateLinkVisible( linkName );

            if( mode.equalsIgnoreCase( "is" ) && flag )
            {
                GlobalNavigationStepDef.mLog.info( "Verification successfully." );
            }
            else if( mode.equalsIgnoreCase( "is not" ) && !flag )
            {
                GlobalNavigationStepDef.mLog.info( "Verification successfully." );
            }
            else
            {
                GlobalNavigationStepDef.mLog.info( "Failed: Verification failed" );
                err = ErrorCodes.FAILED_WITH_EXCEPTION;
            }
        }
        catch( Exception ex )
        {
            GlobalNavigationStepDef.mLog.error( Util.getCompleteStackTraceInfo( ex ) );
            err = ErrorCodes.FAILED_WITH_EXCEPTION;
        }

        //end block
        Util.logStepDefEnd( GlobalNavigationStepDef.mLog, stepId, err );

    }

    /**
     * Step to execute the global navigation toolbar command. This step has variable support.
     *
     * @param stepId ID of the test step
     * @param cmdTitle actual command on the global navigation toolbar, which is to be clicked
     * @param selectValue actual command to be selected under the command clicked
     * @throws Throwable Exception in case of error
     * @published
     * @author yunus_s
     */
    @Given( "^\"([^\"]*)\" select \"([^\"]*)\" under command \"([^\"]*)\" on Global Navigation Bar$" )
    public void select_under_command_on_Global_Navigation_Bar( String stepId, String selectValue, String cmdTitle )
        throws Throwable
    {
        //Start block
        GlobalNavigationStepDef.mLog.trace(
                "Start of public void select_under_command_in_the_Global_Navigation_Bar(String stepId, String selectValue, String cmdTitle)" );
        Util.logStepDefStart( GlobalNavigationStepDef.mLog, stepId );
        GlobalNavigationStepDef.mLog.info(
                stepId + " select " + selectValue + " under command " + cmdTitle + " in the Global Navigation Bar" );
        int err = 0;

        GlobalVariable glbVar = GlobalVariable.getInstance();
        //Added for variable support
        cmdTitle = cmdTitle.contains( "$(" ) ? glbVar.getVariableValue( cmdTitle ) : cmdTitle;
        selectValue = selectValue.contains( "$(" ) ? glbVar.getVariableValue( selectValue ) : selectValue;

        try
        {
            //Implementation block
            //instantiate object of GlobalToolbar class
            GlobalNavigation glbNavToolbar = GlobalNavigation.getInstance();

            //find the object
            glbNavToolbar.clickOnCmdUnderGlbNavCmd( selectValue, cmdTitle );

            //wait for the progress bar to hide
            GlobalHeader glbHeader = GlobalHeader.getInstance();
            glbHeader.isProgressBarGone();

        }
        catch( Exception ex )
        {
            GlobalNavigationStepDef.mLog.error( Util.getCompleteStackTraceInfo( ex ) );
            err = ErrorCodes.FAILED_WITH_EXCEPTION;
        }

        //end block
        Util.logStepDefEnd( GlobalNavigationStepDef.mLog, stepId, err );

    }

    /**
     * This step definition is used to select the value of the given theme name by user from the Change theme dropdown
     * present on the Global Tool Bar. This step has variable support.
     *
     * @param stepId ID of the test step
     * @param value - Name of the theme present on Change theme dropdown.
     * @throws Throwable Exception in case of error
     * @unpublished
     */
    @When( "^\"([^\"]*)\" Select value \"([^\"]*)\" from the theme dropdown$" )
    public void select_value_from_the_dropdown( String stepId, String value )
        throws Throwable
    {
        //Start block
        GlobalNavigationStepDef.mLog.trace(
                "Start of public void select_value_from_the_dropdown(String stepId, String value, String theamdropdwn)" );
        Util.logStepDefStart( GlobalNavigationStepDef.mLog, stepId );
        GlobalNavigationStepDef.mLog.info( stepId + "Select value" + value + "from the dropdown" );
        int err = 0;

        GlobalVariable glbVar = GlobalVariable.getInstance();
        //Added for variable support
        value = value.contains( "$(" ) ? glbVar.getVariableValue( value ) : value;

        try
        {
            //Implementation block
            //instantiate object of GlobalToolbar class
            // Select the given theme name from the theme dropdown
            GlobalNavigation globalToolbarPg = GlobalNavigation.getInstance();
            err = globalToolbarPg.selGivenTheme( value );

            //wait for the progress bar to hide
            GlobalHeader glbHeader = GlobalHeader.getInstance();
            glbHeader.isProgressBarGone();

        }
        catch( Exception ex )
        {
            GlobalNavigationStepDef.mLog.error( Util.getCompleteStackTraceInfo( ex ) );
            err = ErrorCodes.FAILED_WITH_EXCEPTION;
        }

        //end block
        Util.logStepDefEnd( GlobalNavigationStepDef.mLog, stepId, err );
    }

    /**
     * This stepDef is used to take ScreenShot of navigation bar
     *
     * @param stepId ID of the step
     * @throws Throwable throws Exception in case of failure
     * @unpublished
     */
    @Then( "^\"([^\"]*)\" Take ScreenShot of Navigation bar only$" )
    public void takeScreenShotOfNavigationBarOnly( String stepId )
        throws Throwable

    {
        int err = 0;
        GlobalNavigationStepDef.mLog.trace( "Start of public void takeScreenShotOfNavigationBarOnly(String stepId)" );
        Util.logStepDefStart( GlobalNavigationStepDef.mLog, stepId );
        GlobalNavigationStepDef.mLog.info( stepId + "take ScreenShot of Navigation bar only" );

        try
        {
            GlobalNavigation globalnavigation = GlobalNavigation.getInstance();
            err = globalnavigation.snapShotOnNavigationbar( stepId );
        }
        catch( Exception ex )
        {
            GlobalNavigationStepDef.mLog.error( Util.getCompleteStackTraceInfo( ex ) );
            err = ErrorCodes.FAILED_WITH_EXCEPTION;
        }
        Util.logStepDefEnd( GlobalNavigationStepDef.mLog, stepId, err );
    }

    /**
     * This step is used to Take ScreenShot of Navigation panel. It is assumed that panel is visible to take screenshot.
     *
     * @param stepId Id of the step
     * @throws Throwable throws error if exception Occurs
     */
    @Then( "^\"([^\"]*)\" Take ScreenShot of Navigation panel$" )
    public void takeScreenShotOfNavigationPanel( String stepId )
        throws Throwable

    {
        int err = 0;
        GlobalNavigationStepDef.mLog.trace( "Start of public void takeScreenShotOfNavigationPanel( String stepId )" );
        Util.logStepDefStart( GlobalNavigationStepDef.mLog, stepId );
        GlobalNavigationStepDef.mLog.info( stepId + " Take ScreenShot of Navigation panel" );

        try
        {
            GlobalNavigation globalnavigation = GlobalNavigation.getInstance();
            err = globalnavigation.snapShotOnNavigationPanel( stepId );
        }
        catch( Exception ex )
        {
            GlobalNavigationStepDef.mLog.error( Util.getCompleteStackTraceInfo( ex ) );
            err = ErrorCodes.FAILED_WITH_EXCEPTION;
        }
        Util.logStepDefEnd( GlobalNavigationStepDef.mLog, stepId, err );
    }

    /**
     * This step is used to Take snapshot of web element given its name and id which is used to identify the Element
     *
     * @param stepId Id of the step
     * @param name Name of the WebElemen
     * @param WebID ID of the element
     * @throws Throwable throwable Exception
     * @unpublished
     */
    @Then( "^\"([^\"]*)\" Take snapshot of \"([^\"]*)\" \"([^\"]*)\"$" )
    public void takeSnapshotWebelement( String stepId, String name, String WebID )
        throws Throwable

    {
        int err = 0;
        GlobalNavigationStepDef.mLog.trace(
                "Start of public void takeSnapshotWebelement( String stepId ,String name,String ID)" );
        //Start block
        Util.logStepDefStart( GlobalNavigationStepDef.mLog, stepId );
        GlobalNavigationStepDef.mLog.info( stepId + " Take snapshot of " + name + " " + WebID );

        //Implementation block
        try
        {
            GlobalNavigation globalnavigation = GlobalNavigation.getInstance();
            err = globalnavigation.takeSnapshotOfWebelement( WebID, stepId );
        }

        catch( Exception ex )
        {
            GlobalNavigationStepDef.mLog.error( Util.getCompleteStackTraceInfo( ex ) );
            err = ErrorCodes.FAILED_WITH_EXCEPTION;

        }
        //end block
        Util.logStepDefEnd( GlobalNavigationStepDef.mLog, stepId, err );
    }

    /**
     * Step definition to verify that user page is opened, it is assumed that user is logged in with given user name and
     * selected profile link from the user link option.
     *
     * @param stepId stepId stepId ID of this step
     * @throws Throwable Throwable throws exception if any error
     * @unpublished
     */
    @Then( "^\"([^\"]*)\" Validate that user profile page is opened$" )
    public void validate_that_user_profile_page_is_opened( String stepId )
        throws Throwable
    {
        //Start block
        GlobalNavigationStepDef.mLog.trace(
                "Starting of StepDef validate_that_user_profile_page_is_opened(String stepId)" );
        Util.logStepDefStart( GlobalNavigationStepDef.mLog, stepId );
        GlobalNavigationStepDef.mLog.info( stepId + "Validate that user profile page is opened" );
        int err = 0;
        try
        {
            //Implementation block
            GlobalNavigation glbNavToolbar = GlobalNavigation.getInstance();
            err = glbNavToolbar.verifyUserProfilePage();
        }
        catch( Exception ex )
        {
            GlobalNavigationStepDef.mLog.error( Util.getCompleteStackTraceInfo( ex ) );
            err = ErrorCodes.FAILED_WITH_EXCEPTION;
        }

        //end block
        Util.logStepDefEnd( GlobalNavigationStepDef.mLog, stepId, err );
    }
}
