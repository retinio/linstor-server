package com.linbit.linstor.debug;

import com.linbit.AutoIndent;
import com.linbit.linstor.LinStorException;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class DebugPrintHelper
{
    private static final int SPRT_TEXT_LENGTH = 118;

    private static final char SPRT_TEXT_CHAR = '\u2550';

    private final String sprtText;

    private static final DebugPrintHelper INSTANCE = new DebugPrintHelper();

    private DebugPrintHelper()
    {
        char[] sprtTextData = new char[SPRT_TEXT_LENGTH];
        Arrays.fill(sprtTextData, SPRT_TEXT_CHAR);
        sprtText = new String(sprtTextData);
    }

    public static DebugPrintHelper getInstance()
    {
        return INSTANCE;
    }

    public void printMissingParamError(
        PrintStream debugErr,
        String paramName
    )
    {
        printError(
            debugErr,
            String.format(
                "The required parameter '%s' is not present.",
                paramName
            ),
            null,
            "Reenter the command including the required parameter.",
            null
        );
    }

    public void printMultiMissingParamError(
        PrintStream debugErr,
        Map<String, String> parameters,
        String... paramNameList
    )
    {
        Set<String> missingParams = new TreeSet<>();
        for (String paramName : paramNameList)
        {
            if (parameters.get(paramName) == null)
            {
                missingParams.add(paramName);
            }
        }
        String errorText = null;
        String correctionText = null;
        if (missingParams.size() == 1)
        {
            Iterator<String> paramIter = missingParams.iterator();
            errorText = String.format(
                "The required parameter '%s' is not present.",
                paramIter.next()
            );
            correctionText = "Reenter the command including the required parameter.";
        }
        else
        if (missingParams.size() > 0)
        {
            StringBuilder errorTextBld = new StringBuilder();
            errorTextBld.append("The following required parameters are not present:\n");
            for (String paramName : missingParams)
            {
                errorTextBld.append(String.format("    %s\n", paramName));
            }
            errorText = errorTextBld.toString();
            correctionText = "Reenter the command including the required parameters.";
        }
        if (errorText != null && correctionText != null)
        {
            printError(
                debugErr,
                errorText,
                null,
                correctionText,
                null
            );
        }
    }

    public void printDmException(PrintStream debugErr, LinStorException dmExc)
    {
        String descText = dmExc.getDescriptionText();
        if (descText == null)
        {
            descText = dmExc.getMessage();
            if (descText == null)
            {
                descText = "(Uncommented exception of type " +
                    dmExc.getClass().getCanonicalName() + ")";
            }
        }

        printError(
            debugErr,
            descText,
            dmExc.getCauseText(),
            dmExc.getCorrectionText(),
            dmExc.getDetailsText()
        );
    }

    public void printError(
        PrintStream debugErr,
        String errorText,
        String causeText,
        String correctionText,
        String errorDetailsText
    )
    {
        if (errorText != null)
        {
            debugErr.println("Error:");
            AutoIndent.printWithIndent(debugErr, 4, errorText);
        }
        if (causeText != null)
        {
            debugErr.println("Cause:");
            AutoIndent.printWithIndent(debugErr, 4, causeText);
        }
        if (correctionText != null)
        {
            debugErr.println("Correction:");
            AutoIndent.printWithIndent(debugErr, 4, correctionText);
        }
        if (errorDetailsText != null)
        {
            debugErr.println("Error details:");
            AutoIndent.printWithIndent(debugErr, 4, errorDetailsText);
        }
    }

    public void printSectionSeparator(PrintStream output)
    {
        output.println(sprtText);
    }
}
