/*
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.xwiki.contrib.confluence.parser.xhtml.internal.wikimodel;

import org.xwiki.rendering.wikimodel.xhtml.handler.TagHandler;
import org.xwiki.rendering.wikimodel.xhtml.impl.TagContext;

/**
 * Handles time tags.
 * <p>
 * Example:
 * <p>
 * {@code
 * <time datetime="2020-01-12" />
 * }
 *
 * @version $Id$
 * @since 9.4.5
 */
public class TimeTagHandler extends TagHandler implements ConfluenceTagHandler
{
    /**
     * Constructor (checkstyle complains that this comment is missing although the other classes don't have it).
     */
    public TimeTagHandler()
    {
        super(false);
    }

    @Override
    protected void begin(TagContext context)
    {
        String date = context.getParams().getParameter("datetime").getValue();
        context.getScannerContext().onWord(date);
    }
}
