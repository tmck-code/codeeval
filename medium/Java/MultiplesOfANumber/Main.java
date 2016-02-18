/******************************************************************************
 *  The MIT License (MIT)
 *
 *  Copyright (c) 2015 Thomas Mckeesick
 *
 *  Permission is hereby granted, free of charge, to any person obtaining a
 *  copy of this software and associated documentation files (the "Software"),
 *  to deal in the Software without restriction, including without limitation
 *  the rights to use, copy, modify, merge, publish, distribute, sublicense,
 *  and/or sell copies of the Software, and to permit persons to whom the
 *  Software is furnished to do so, subject to the following conditions:
 *
 *  The above copyright notice and this permission notice shall be included in
 *  all copies or substantial portions of the Software.
 *
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
 *  FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER
 *  DEALINGS IN THE SOFTWARE.
 *
 *******************************************************************************
 *
 * Class Name:        Main
 *
 * @author            Thomas McKeesick
 * Creation Date:     Thursday, May 07 2015, 16:47
 * Last Modified:     Thursday, May 07 2015, 16:48
 *
 * Class Description:  This class is a Java solution to the "Multiples of a
 *                     Number" challenge on CodeEval
 *
 */

import java.io.BufferedReader;
import java.io.FileReader;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        if(args.length == 1)
        try {
            BufferedReader in = new BufferedReader(new FileReader(args[0]));
            String line;
            String[] nums = new String[2];
            int X, N;

            while((line = in.readLine()) != null) {
                nums = line.split(",");
                X = Integer.parseInt(nums[0]);
                N = Integer.parseInt(nums[1]);
                
                int out = (X%N != 0) ? N*(X/N + 1) : X;
                System.out.println(out);
            }
        } catch( IOException e ) {
            System.err.println("A file I/O error occurred: " 
                    + e.getStackTrace());
            System.exit(1);
        }
        else System.exit(0);
    }
}

